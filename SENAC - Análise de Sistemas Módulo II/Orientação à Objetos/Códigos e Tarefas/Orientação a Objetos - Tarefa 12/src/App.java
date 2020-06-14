
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Dimension;
import java.awt.SystemColor;

public class App extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTipo;
	private ArrayList<Animais> lista = new ArrayList<Animais>();
	private JTextField txtRaca;
	private JTextField txtId;
	private JTextField txtCor;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtNascimento;
	private static String ARQUIVO = "/home/linuxlite/Workspaces/Relatorio.txt";
	
	public String inserirAnimais() {
		try {
			Animais p = new Animais();
			p.setId(Integer.parseInt(txtId.getText()));
			p.setNome(txtNome.getText());
			p.setTipo(txtTipo.getText());
			p.setRaca(txtRaca.getText());
			p.setCor(txtCor.getText());
			p.setPeso(Integer.parseInt(txtPeso.getText()));
			p.setAltura(Integer.parseInt(txtAltura.getText()));
			p.setAnoNascimento(txtNascimento.getText());
			lista.add(p);
			lerGravar();
			
			
			
			
			
			
			/*ou 
				Animais x = new Animais(txtNome.getText(), txtFone.getText());
				lista.add(x);
			*/
			limparCampos();
			return "Inserido com sucesso!";
		} catch (Exception e) {
			return "Erro ao Inserir!";
		}
	}
	
	private void lerGravar() throws IOException {
		FileWriter writer = new FileWriter(ARQUIVO); 
		for(Animais str: lista) {
		  writer.write(Integer.parseInt(txtId.getText()) + ","
		  				+ txtNome.getText() + ","
		  				+ txtTipo.getText() + ","
		  				+ txtRaca.getText() + ","
		  				+ txtCor.getText() + ","
		  				+ Integer.parseInt(txtPeso.getText()) + ","
		  				+ Integer.parseInt(txtAltura.getText()) + ","
		  				+ txtNascimento.getText() + ","		  
		  				+ System.lineSeparator());
		}
		writer.close();
		
	}

	public String listarAnimaiss() {
		String dados = "";
		for (Animais p : lista) {
			dados = dados + "Id: " + p.getId() 
						+ "  -  Nome: " + p.getNome() 
						+ "  -  Tipo: " + p.getTipo()
						+ "  -  Raça: " + p.getRaca()
						+ "  -  Cor: " + p.getCor() 
						+ "  -  Peso: " + p.getPeso()
						+ "  -  Altura" + p.getAltura()
						+ "  -  Nascimento: " + p.getAnoNascimento() 
						+ "\n";
		}
		return dados;
	}
	
	public void limparCampos() {
		txtId.setText("");
		txtNome.setText("");
		txtTipo.setText("");
		txtRaca.setText("");
		txtCor.setText("");
		txtPeso.setText("");
		txtAltura.setText("");
		txtNascimento.setText("");
		txtId.requestFocus();
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			

			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public App() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				limparCampos();
			}
		});
		setTitle("\nCadastros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 259, 369);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.DARK_GRAY);
		lblNome.setBounds(12, 70, 66, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtNome.setFont(new Font("Dialog", Font.ITALIC, 10));
		txtNome.setBounds(106, 68, 126, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(Color.DARK_GRAY);
		lblTipo.setBounds(12, 102, 66, 14);
		contentPane.add(lblTipo);
		
		txtTipo = new JTextField();
		txtTipo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtTipo.setFont(new Font("Dialog", Font.ITALIC, 10));
		txtTipo.setBounds(106, 100, 126, 20);
		contentPane.add(txtTipo);
		txtTipo.setColumns(10);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String mens = inserirAnimais();
				JOptionPane.showMessageDialog(null, mens);
				// Fim - Codigo desenvolvido 
			}
		});
		btnInserir.setBounds(26, 306, 89, 23);
		contentPane.add(btnInserir);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				FrmContatosLista frmLista = new FrmContatosLista();
				frmLista.setLista(lista);
				frmLista.setVisible(true);
			}
		});
		btnListar.setBounds(126, 306, 89, 23);
		contentPane.add(btnListar);
		
		JLabel lblRaca = new JLabel("Raça:");
		lblRaca.setForeground(Color.DARK_GRAY);
		lblRaca.setBounds(12, 133, 66, 14);
		contentPane.add(lblRaca);
		
		txtRaca = new JTextField();
		txtRaca.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtRaca.setFont(new Font("Dialog", Font.ITALIC, 10));
		txtRaca.setBounds(106, 131, 126, 20);
		contentPane.add(txtRaca);
		txtRaca.setColumns(10);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setForeground(Color.DARK_GRAY);
		lblId.setBounds(12, 38, 66, 14);
		contentPane.add(lblId);
		
		txtId = new JTextField();
		txtId.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtId.setFont(new Font("Dialog", Font.ITALIC, 10));
		txtId.setColumns(10);
		txtId.setBounds(106, 36, 126, 20);
		contentPane.add(txtId);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setForeground(Color.DARK_GRAY);
		lblCor.setBounds(12, 166, 66, 14);
		contentPane.add(lblCor);
		
		txtCor = new JTextField();
		txtCor.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtCor.setFont(new Font("Dialog", Font.ITALIC, 10));
		txtCor.setColumns(10);
		txtCor.setBounds(106, 164, 126, 20);
		contentPane.add(txtCor);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setForeground(Color.DARK_GRAY);
		lblPeso.setBounds(12, 198, 66, 14);
		contentPane.add(lblPeso);
		
		txtPeso = new JTextField();
		txtPeso.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtPeso.setFont(new Font("Dialog", Font.ITALIC, 10));
		txtPeso.setColumns(10);
		txtPeso.setBounds(106, 196, 126, 20);
		contentPane.add(txtPeso);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setForeground(Color.DARK_GRAY);
		lblAltura.setBounds(12, 230, 66, 14);
		contentPane.add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtAltura.setFont(new Font("Dialog", Font.ITALIC, 10));
		txtAltura.setColumns(10);
		txtAltura.setBounds(106, 228, 126, 20);
		contentPane.add(txtAltura);
		
		JLabel lblNascimento = new JLabel("Nascimento: ");
		lblNascimento.setForeground(Color.DARK_GRAY);
		lblNascimento.setBounds(12, 263, 89, 14);
		contentPane.add(lblNascimento);
		
		txtNascimento = new JTextField();
		txtNascimento.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtNascimento.setFont(new Font("Dialog", Font.ITALIC, 10));
		txtNascimento.setColumns(10);
		txtNascimento.setBounds(106, 261, 126, 20);
		contentPane.add(txtNascimento);
		
		JLabel lblNewLabel = new JLabel("⤷Apenas Números");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Dialog", Font.ITALIC, 9));
		lblNewLabel.setBounds(116, 54, 99, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("⤷Apenas Números");
		label.setForeground(Color.LIGHT_GRAY);
		label.setFont(new Font("Dialog", Font.ITALIC, 9));
		label.setBounds(116, 214, 99, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("⤷Apenas Números");
		label_1.setForeground(Color.LIGHT_GRAY);
		label_1.setFont(new Font("Dialog", Font.ITALIC, 9));
		label_1.setBounds(116, 248, 99, 15);
		contentPane.add(label_1);
	}
}
