
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollBar;


public class Agenda extends JFrame {
	
	private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoTelefone;
	private JTextField campoMatricula;
	private JTextField campoEmail;
	private JTextField campoEndereco;
	private JTextField campoBairro;
	private JTextField campoCidade;
	private JTextField campoUf;
	private JTextField campoCEP;
	private String dados;
	private String mensagem;
	private JTextArea textArea;
	
	public String InserirPessoa() {
		try {
			Pessoa p = new Pessoa();
			p.setNome(campoNome.getText());
			p.setTelefone(campoTelefone.getText());
			p.setMatricula(Integer.parseInt(campoMatricula.getText()));
			p.setEmail(campoEmail.getText());
			p.setEndereco(campoEndereco.getText());
			p.setBairro(campoBairro.getText());
			p.setCidade(campoCidade.getText());
			p.setUf(campoUf.getText());
			p.setCep(Integer.parseInt(campoCEP.getText()));
			lista.add(p);
			
			// Psssoa x = new Pessoa(campoNome.getText(), campoTelefone.getText());
			// lista.add(x);
			limparCampos();
			
			return "Pessoa Inserida com sucesso";
			
		} catch (Exception e) {
			return "Erro ao inserir, favor digitar apenas numeros na matricula";
		}
	
	}
	
	public String listarPessoas() {
		dados = "";
		for (Pessoa p: lista) {
			dados = dados 	+ "Nome: " + p.getNome() 
							+ "\nTelefone: " + p.getTelefone() 
							+ "\nMatricula: " + p.getMatricula() 
							+ "\nEmail: " + p.getEmail() 
							+ "\nEndereço: " + p.getEndereco()
							+ "\nBairro: " + p.getBairro()
							+ "\nCidade: " + p.getCidade()
							+ "\nUF: " + p.getUf()
							+ "\nCEP: " + p.getUf()
							+"\n\n";
		
		}
		return dados;
		
	}
	
	public void limparCampos() {
		campoNome.setText("");
		campoTelefone.setText("");
		campoMatricula.setText("");
		campoEmail.setText("");
		campoEndereco.setText("");
		campoBairro.setText("");
		campoCidade.setText("");
		campoUf.setText("");
		campoCEP.setText("");
	}
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Agenda() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Agenda - Contatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(63, 14, 66, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone:");
		lblNewLabel_1.setBounds(63, 36, 66, 15);
		contentPane.add(lblNewLabel_1);
		
		campoNome = new JTextField();
		campoNome.setBounds(170, 12, 229, 19);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		campoTelefone = new JTextField();
		campoTelefone.setBounds(170, 34, 114, 19);
		contentPane.add(campoTelefone);
		campoTelefone.setColumns(10);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {

		

			public void actionPerformed(ActionEvent arg0) {
				mensagem = InserirPessoa();
				JOptionPane.showMessageDialog(null, mensagem);
				
				
				}
		});
		
		btnInserir.setBounds(114, 407, 114, 25);
		contentPane.add(btnInserir);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dados = listarPessoas();
				JOptionPane.showMessageDialog(null, dados);
				
				dados = dados.replaceAll("\\s", "\n");
				textArea.setText(dados);
			
				//textField.setText(lista);
				
				
				
			}
		});
		btnListar.setBounds(242, 407, 114, 25);
		contentPane.add(btnListar);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(63, 58, 89, 15);
		contentPane.add(lblMatricula);
		
		campoMatricula = new JTextField();
		campoMatricula.setColumns(10);
		campoMatricula.setBounds(170, 56, 114, 19);
		contentPane.add(campoMatricula);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(63, 80, 89, 15);
		contentPane.add(lblEmail);
		
		campoEmail = new JTextField();
		campoEmail.setColumns(10);
		campoEmail.setBounds(170, 78, 229, 19);
		contentPane.add(campoEmail);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(63, 101, 89, 15);
		contentPane.add(lblEndereco);
		
		campoEndereco = new JTextField();
		campoEndereco.setColumns(10);
		campoEndereco.setBounds(170, 99, 229, 19);
		contentPane.add(campoEndereco);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(63, 124, 89, 15);
		contentPane.add(lblBairro);
		
		campoBairro = new JTextField();
		campoBairro.setColumns(10);
		campoBairro.setBounds(170, 122, 114, 19);
		contentPane.add(campoBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(63, 145, 89, 15);
		contentPane.add(lblCidade);
		
		campoCidade = new JTextField();
		campoCidade.setColumns(10);
		campoCidade.setBounds(170, 143, 114, 19);
		contentPane.add(campoCidade);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setBounds(63, 167, 89, 15);
		contentPane.add(lblUf);
		
		campoUf = new JTextField();
		campoUf.setColumns(10);
		campoUf.setBounds(170, 165, 29, 19);
		contentPane.add(campoUf);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(63, 188, 89, 15);
		contentPane.add(lblCep);
		
		campoCEP = new JTextField();
		campoCEP.setColumns(10);
		campoCEP.setBounds(170, 186, 114, 19);
		contentPane.add(campoCEP);
		
		textArea = new JTextArea();
		textArea.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textArea.setBounds(73, 215, 326, 170);
		contentPane.add(textArea);
		
	}
}
