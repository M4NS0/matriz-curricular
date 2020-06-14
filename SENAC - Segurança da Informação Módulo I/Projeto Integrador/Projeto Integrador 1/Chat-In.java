
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JOptionPane;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

class ChatIn extends Thread {
	
	static String nome;
	static int porta;
	static String ipVizinho;
	static int portaVizinho;
	static DatagramSocket socket;
	static Key chave;
	static String escolha1;
	static String arquivo;
	static DatagramSocket dsoc;
	static DatagramSocket dsoc2;
	static FileOutputStream f;
	static String arquivo1;
	static Socket conexao;
	static ServerSocket servidor;
	static DataOutputStream dos;
	static ServerSocket server;
	static ObjectInputStream in;
	static String escolha2;
	static Object ipNovo;
	static String latitude;
	static String longitude;

	public ChatIn() {
		try {
			socket = new DatagramSocket(porta);
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		try {
			while (true) {

				ObjectInputStream arquivoChave = new ObjectInputStream(new FileInputStream("Chave.key"));
				chave = (Key) arquivoChave.readObject();
				arquivoChave.close();

				Cipher decipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
				decipher.init(Cipher.DECRYPT_MODE, chave);

				byte[] dados = new byte[1024];
				DatagramPacket pacoteRecebido = new DatagramPacket(dados, dados.length);
				socket.receive(pacoteRecebido);

				String origem = pacoteRecebido.getAddress().toString();
				int portaOrigem = pacoteRecebido.getPort();

				byte[] dadosRecebidos = Arrays.copyOfRange(pacoteRecebido.getData(), 0, pacoteRecebido.getLength());
				byte[] dadosDecifrados = decipher.doFinal(dadosRecebidos);

				String mensagemRecebida = new String(dadosDecifrados);
				System.out.println(
						mensagemRecebida + "\t\t→  " + dados + "  ←");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void gerarChave() throws Exception {
		Key chave;

		KeyGenerator gerador = KeyGenerator.getInstance("DES");
		gerador.init(new SecureRandom());

		chave = gerador.generateKey();
		ObjectOutputStream arquivoChave = new ObjectOutputStream(new FileOutputStream("Chave.key"));
		arquivoChave.writeObject(chave);
		arquivoChave.close();
		System.out.println("Chave Gerada: " + chave.getEncoded().toString());

	}

	public void enviarmensagem() {
		System.out.println("\nA qualquer momento digite '/menu' para acessar o Menu de opções:\n\nDigite uma mensagem: ");
		
		try {
			while (true) {

				ObjectInputStream arquivoChave = new ObjectInputStream(new FileInputStream("Chave.key"));
				chave = (Key) arquivoChave.readObject();
				Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
				cipher.init(Cipher.ENCRYPT_MODE, chave);

				Scanner leitura = new Scanner(System.in);
				String mensagem = leitura.nextLine();

				if (mensagem.equalsIgnoreCase("/menu")) {
					abreMenu();
				}

				mensagem = nome + " : " + mensagem;

				byte[] bytesMensagem = new byte[1024];
				bytesMensagem = mensagem.getBytes();

				byte[] dadosCifrados = cipher.doFinal(bytesMensagem);

				DatagramPacket pacoteEnviado = new DatagramPacket(dadosCifrados, dadosCifrados.length,
						InetAddress.getByName(ipVizinho), portaVizinho);
				socket.send(pacoteEnviado);

				System.out.println(mensagem + "\t\t→  " + dadosCifrados + "  ←");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void abreMenu() throws 	UnknownHostException, 
									IOException, 
									InvalidKeyException, 
									NoSuchAlgorithmException,
									NoSuchPaddingException, 
									ClassNotFoundException, 
									IllegalBlockSizeException, 
									BadPaddingException,
									URISyntaxException, InterruptedException {

		escolha1 = String.valueOf(JOptionPane.showInputDialog(null,
						  "\n\n\nDigite 'G' para ver a Geo Localizacao deste Servidor"
						+ "\nDigite 'O' para ver a Geo Localizacao de um outro IP e abrir o Google Maps no Browser           "
						+ "\nDigite 'D' para abrir sua conexão para Download"
						+ "\nDigite 'U' para fazer Upload de Arquivo "
						+ "\nDigite 'S' para sair do Chat"
						+ "\nDigite 'V' para voltar ao Chat\n\n"));
		
		
		while (!escolha1.equalsIgnoreCase("X")) {

			if (escolha1.equalsIgnoreCase("G")) {
				geoLocalizacao();
			}
			if (escolha1.equalsIgnoreCase("O")) {
				geoLocalizacao2();
			}
			if (escolha1.equalsIgnoreCase("U")) {
				enviaArquivo();
			}
			if (escolha1.equalsIgnoreCase("D")) {
				recebeArquivo();
			}
			if (escolha1.equalsIgnoreCase("S")) {
				JOptionPane.showMessageDialog(null, "\n\nSessão encerrada");
				socket.close();
				servidor.close();
				conexao.close();
				System.exit(0);
				break;
			}
			if (escolha1.equalsIgnoreCase("V")) {
				enviarmensagem();
			} else {
				escolha1 = String.valueOf(JOptionPane.showInputDialog(null,
						  "\nESCOLHA INCORRETA!\n\n"
						+ "\n\nDigite 'U' para enviar um arquivo criptografado "
						+ "\nDigite 'S' para sair do Chat" + "\nDigite 'V' para voltar ao chat"));
			}
		}
		abreMenu();

	}

	private void geoLocalizacao()	throws 	InvalidKeyException, 
											UnknownHostException, 
											NoSuchAlgorithmException, 
											NoSuchPaddingException,
											ClassNotFoundException, 
											IllegalBlockSizeException, 
											BadPaddingException, 
											IOException, 
											URISyntaxException, InterruptedException {

		
		URL ipapi = new URL("https://ipapi.co/" + ipVizinho + "/json/");

		URLConnection c = ipapi.openConnection();
		c.setRequestProperty("user-agent", "java-ipapi-client");
		BufferedReader reader = new BufferedReader(new InputStreamReader(c.getInputStream()));
		/*
		*/
		String span = reader.readLine();
		String ip = reader.readLine();
		String city = reader.readLine();
		String region = reader.readLine();
		String region_code = reader.readLine();
		String country = reader.readLine();
		String country_name = reader.readLine();
		String continent_code = reader.readLine();
		String span2 = reader.readLine();
		String postal = reader.readLine();
		latitude = reader.readLine();
		longitude = reader.readLine();
		String timezone = reader.readLine();
		String utf_offset = reader.readLine();
		String country_calling_code = reader.readLine();
		String currency = reader.readLine();
		String languages = reader.readLine();
		String asn = reader.readLine();
		String org = reader.readLine();

		reader.close();

		 for (int cont = 7; cont <=27; cont++) {
	        	if (ip.length() == cont) {
	        		System.out.println(ip.substring(11,(cont-2)));
	        		  JOptionPane.showMessageDialog(null,"\n\n"
	      					+ "                           IP → " + ip.substring(11,(cont-2)) 
								+ "\n                   Cidade → " + city.substring(13,20) 
								+ "\n                   Estado → " + region.substring(15,20) 
							    + "\n       Codigo Estado → " + region_code.substring(20,22) 
							    + "\n           Codigo Pais → " + country.substring(16,18) 
							    + "\n                        Pais → " + country_name.substring(21,27)
							    + "\n                 C.Postal → " + postal.substring(15,20)
							    + "\n                 Latitude → " + latitude.substring(16,24)
							    + "\n              Longitude → " + longitude.substring(17,24)
							    + "\n                       Fuso → " + timezone.substring(17,34)
							    + "\n Prefixo Telefonico → " + country_calling_code.substring(29,32)
							    + "\n                    Moeda → " + currency.substring(17,20)
							    + "\n                   ASNum → " +  asn.substring(13,19)
							    + "\n                       Org   → " + org.substring(12,30)
							    + "                           \n\n");
	        		  escolha2();
		    
	        	}	
		 }

	}

	private void escolha2() throws 	IOException, 
									URISyntaxException, 
									InvalidKeyException, 
									NoSuchAlgorithmException,
									NoSuchPaddingException, 
									ClassNotFoundException, 
									IllegalBlockSizeException, 
									BadPaddingException, InterruptedException {
		
		
		escolha2 = String.valueOf(JOptionPane.showInputDialog(null,
									
									  "\nSe deseja buscar outra Geo Localizacao pelo IP digite 'B' "
									+ "\nSe deseja voltar ao menu digite 'M'\n\n\n"));
		int cont = 1;
		while (cont == 1) {
			if (escolha2.equalsIgnoreCase("A")) {
				if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
					Desktop.getDesktop().browse(new URI("https://www.google.com/maps/search/?api=1&query="
							+ latitude.substring(16, 24) + longitude.substring(17, 24)));
					escolha2();
				}

			}
			if (escolha2.equalsIgnoreCase("M")) {
				abreMenu();
			}
			if (escolha2.equalsIgnoreCase("B")) {
				geoLocalizacao2();
			}

		}

	}

	private void geoLocalizacao2()	throws 	IOException, 
											InvalidKeyException, 
											NoSuchAlgorithmException, 
											NoSuchPaddingException,
											ClassNotFoundException, 
											IllegalBlockSizeException, 
											BadPaddingException, 
											URISyntaxException, InterruptedException {
		
		
		ipNovo = String.valueOf(JOptionPane.showInputDialog(null, "\n\nDigite um numero de IP: "));

		URL ipapi = new URL("https://ipapi.co/" + ipNovo + "/json/");

		URLConnection c = ipapi.openConnection();
		c.setRequestProperty("user-agent", "java-ipapi-client");
		BufferedReader reader = new BufferedReader(new InputStreamReader(c.getInputStream()));
		/*
		*/
		String span = reader.readLine();
		String ip = reader.readLine();
		String city = reader.readLine();
		String region = reader.readLine();
		String region_code = reader.readLine();
		String country = reader.readLine();
		String country_name = reader.readLine();
		String continent_code = reader.readLine();
		String span2 = reader.readLine();
		String postal = reader.readLine();
		String latitude = reader.readLine();
		String longitude = reader.readLine();
		String timezone = reader.readLine();
		String utf_offset = reader.readLine();
		String country_calling_code = reader.readLine();
		String currency = reader.readLine();
		String languages = reader.readLine();
		String asn = reader.readLine();
		String org = reader.readLine();

		reader.close();
		
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
			Desktop.getDesktop().browse(new URI("https://www.google.com/maps/search/?api=1&query="
					+ latitude.substring(16, 24) + longitude.substring(17, 24)));
			
			
		}
		 for (int cont = 7; cont <=27; cont++) {
	        	if (ip.length() == cont) {
	        		System.out.println(ip.substring(11,(cont-2)));
	        		  JOptionPane.showMessageDialog(null,"\n\n"
	      					+ "                           IP → " + ip.substring(11,(cont-2)) 
								+ "\n                   Cidade → " + city.substring(13,20) 
								+ "\n                   Estado → " + region.substring(15,20) 
							    + "\n       Codigo Estado → " + region_code.substring(20,22) 
							    + "\n           Codigo Pais → " + country.substring(16,18) 
							    + "\n                        Pais → " + country_name.substring(21,27)
							    + "\n                 C.Postal → " + postal.substring(15,20)
							    + "\n                 Latitude → " + latitude.substring(16,24)
							    + "\n              Longitude → " + longitude.substring(17,24)
							    + "\n                       Fuso → " + timezone.substring(17,34)
							    + "\n Prefixo Telefonico → " + country_calling_code.substring(29,32)
							    + "\n                    Moeda → " + currency.substring(17,20)
							    + "\n                   ASNum → " +  asn.substring(13,19)
							    + "\n                       Org   → " + org.substring(12,30)
							    + "                           \n\n");
	        		  escolha2();
		    
	        	}	
		 }

	}

	public void enviaArquivo() throws 	IOException, 
										InvalidKeyException, 
										NoSuchAlgorithmException,
										NoSuchPaddingException, 
										ClassNotFoundException, 
										IllegalBlockSizeException, 
										BadPaddingException, URISyntaxException {

		
		arquivo = String.valueOf(JOptionPane.showInputDialog(null,
				"\nDigite o nome do arquivo a ser enviado:"));
	
		try {
			
			Cipher cipher = Cipher.getInstance ("DES/ECB/PKCS5Padding"); 
	        cipher.init ( Cipher.ENCRYPT_MODE , chave );
	        
	        File f = new File(arquivo);
	        FileInputStream in = new FileInputStream(f);
	        
			Socket conexao = new Socket(ipVizinho, portaVizinho);
			System.out.println("\t→ Conectando Sockets.. ");
			Thread.sleep(3000);
			
			OutputStream saida = conexao.getOutputStream();
	        System.out.println("\t→ Conectado com Sucesso.. ");
	    	Thread.sleep(3000);
	    	
	    	OutputStreamWriter osw = new OutputStreamWriter(saida);
	    	BufferedWriter writer = new BufferedWriter(osw);
	    	writer.write(f.getName() + "\n");
			writer.flush();
			
			System.out.println("\t→ Escrevendo Arquivo... ");
			Thread.sleep(3000);
			
			saida.flush();
			System.out.println("\t→ Fechando o arquivo... ");
			Thread.sleep(3000);
			
			int tamanho = 4096; 
		    byte[] buffer = new byte[tamanho]; 
		    byte[] Arquivo = new byte [tamanho];
		    Arquivo = buffer;
		    byte[] ArquivoCifrado = cipher.doFinal(Arquivo); 
		    int lidos = -1;  
		    System.out.println("\t→ Criptografando Arquivo... ");
			Thread.sleep(3000);
			
		    while ((lidos = in.read(ArquivoCifrado, 0, tamanho)) != -1) { 
		    	System.out.println(new String(ArquivoCifrado));
		        saida.write(Arquivo, 0, lidos);  
		        saida.flush();
		        socket.close();
		        System.out.println("\t→ Arquivo Enviado com sucesso!");
				System.out.println("\t→ Voltando ao Menu...");
				Thread.sleep(3000);
	
			
			
			abreMenu();
			}
	}
		catch (Exception e) {
			System.out.println(e);
			}
	
		}
	public void recebeArquivo() throws 	UnknownHostException, 
										IOException, 
										InvalidKeyException, 
										NoSuchAlgorithmException,
										NoSuchPaddingException, 
										IllegalBlockSizeException, 
										BadPaddingException, 
										ClassNotFoundException, URISyntaxException, InterruptedException {
		
		try {
			Key chave;
			ObjectInputStream arquivoChave = new ObjectInputStream(new FileInputStream("Chave.key"));
			chave = (Key) arquivoChave.readObject();
			arquivoChave.close();
			System.out.println("\t→ Carregando Chave... ");
			Thread.sleep(3000);
			
			Cipher decipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
			decipher.init(Cipher.DECRYPT_MODE, chave);

			
			ServerSocket servidor = new ServerSocket(porta);
			System.out.println("\t→ Socket para Download iniciado.. ");
			
			Socket conexao = servidor.accept();
			System.out.println("\t→ Conexao estabelecida.. ");
			Thread.sleep(3000);
			
			InputStream entrada = conexao.getInputStream();
			InputStreamReader isr = new InputStreamReader(entrada);
			System.out.println("\t→ Recebendo dados..  ");
			Thread.sleep(3000);
			
			BufferedReader reader = new BufferedReader(isr);
			String arquivo = reader.readLine();
			File novo = new File("arquivo-recebido-com-seguranca" + arquivo);
			FileOutputStream out = new FileOutputStream(novo);
			System.out.println("\t→ Lendo Arquivo... ");
			Thread.sleep(3000);
			
			Byte[] Dados = new Byte[1024];

			int tamanho2 = 4096; // buffer de 4KB
			byte[] buffer = new byte[tamanho2];
			byte[] ArquivoDecifrado = new byte[4096];
			ArquivoDecifrado = decipher.doFinal(buffer);
			int lidos = -1;
			System.out.println("\t→ Decriptando Arquivo... ");
			Thread.sleep(3000);
			
			while ((lidos = in.read(buffer, 0, tamanho2)) != -1) {
				System.out.println(lidos);
				out.write(tamanho2);
				out.write(buffer, 0, lidos);
				System.out.println("\t→ Escrevendo arquivos..  ");
				Thread.sleep(3000);
			}

			System.out.println(new String(ArquivoDecifrado));
			System.out.println("\t→ Arquivo Recebido com sucesso..  ");
			Thread.sleep(3000);
			out.flush();
			abreMenu();
			
		} catch (IOException e) {
			abreMenu();
		}
	}

				
			
	public static class PeerChat1 {
		private static String op;

		public static void main(String[] args) throws Exception {
			int escolha = 0;

			JOptionPane.showMessageDialog(null,
							  "\n\n\tBem Vindo ao Chat-In™ \n\n   " 
							+ "\nO Chat-In™vem com as seguintes implementações: "
							+ "\n-Funciona em protocolo UDP" 
							+ "\n-Bate-Papo em criptografia Data Encryption Standard" 
							+ "\n-Transferência de arquivo via TCP"
							+ "\n-Geo Localizador por IP"
							+ "\n-Dialogs com JOptionPane"
							+ "\n-O Chat-In™ utiliza apenas um programa para Servidor e Cliente        "
							
							+ "\n\n\nCreditos: Alexandre Paiva e Bruno Manso\n\n\n");

			nome = String.valueOf(JOptionPane.showInputDialog(null, "Digite seu NOME"));
			System.out.println("Nome: " + nome);

			porta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a porta de SAIDA"));
			System.out.println("Porta de Saída: " + porta);

			portaVizinho = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a porta de Destino"));
			System.out.println("Porta de Saída: " + portaVizinho);
			opcao();

			while (escolha == 0) {
				String opcao = String.valueOf(JOptionPane.showInputDialog(null,
								  "\n\nDigite 'G' para gerar uma chave de segurança" 
								+ "\nOu Digite 'C' para continuar\n\n"));

				if (opcao.equalsIgnoreCase("G")) {
					gerarChave();

				} else {
					ChatIn chat = new ChatIn();
					Thread t = new Thread(chat);
					t.start();
					chat.enviarmensagem();
				}
			}
		}

		private static void opcao() throws UnknownHostException {
			op = String.valueOf(JOptionPane.showInputDialog(null, 
							  "\n\nSe deseja usar um IP Local digite 'L',          "
							+ "\nSe deseja usar um IP Externo digite 'E'" 
							+ "\nSe deseja usar um outro IP digite 'O'\n\n"));
			
			if (op.equalsIgnoreCase("L")) {
				ipVizinho = "127.0.0.1";
				System.out.println("Conectado a: " + ipVizinho);
			}
			if (op.equalsIgnoreCase("E")) {
			
				String ipExterno = "";
				try {
					URL url_name = new URL("http://bot.whatismyipaddress.com");

					BufferedReader sc = new BufferedReader(new InputStreamReader(url_name.openStream()));

					// reads system IPAddress
					ipExterno = sc.readLine().trim();
				} catch (Exception e) {
					ipExterno = "Não pode ser executado de forma correta!!";
				}
				System.out.println("Conectado a: " + ipExterno);
				ipVizinho = ipExterno;
			}
			if (op.equalsIgnoreCase("O")) {
				ipVizinho = String.valueOf(JOptionPane.showInputDialog(null, "Digite o IP do DESTINO"));
				System.out.println("Conectado a: " + ipVizinho);

			}

		}
	}
}