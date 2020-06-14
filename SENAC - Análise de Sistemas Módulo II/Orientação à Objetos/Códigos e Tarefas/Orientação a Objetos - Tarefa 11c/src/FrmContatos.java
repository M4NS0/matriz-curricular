import java.awt.BorderLayout;
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
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrmContatos extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtFone;

	private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	private JTextField txtMatricula;
	
	public String inserirPessoa() {
		try {
			Pessoa p = new Pessoa();
			p.setNome(txtNome.getText());
			p.setTelefone(txtFone.getText());
			p.setMatricula(Integer.parseInt(txtMatricula.getText()));
			lista.add(p);
			/*ou 
				Pessoa x = new Pessoa(txtNome.getText(), txtFone.getText());
				lista.add(x);
			*/
			limparCampos();
			return "Pessoa inserida com sucesso";
		} catch (Exception e) {
			return "Erro ao Inserir! Favor digitar apenas n�meros na matr�cula!";
		}
	}
	
	public String listarPessoas() {
		String dados = "";
		for (Pessoa p : lista) {
			dados = dados + "Nome: " + p.getNome() 
						+ "  -  Telefone: " + p.getTelefone() 
						+ "  -  Matr�cula: " + p.getMatricula() + "\n";
		}
		return dados;
	}
	
	public void limparCampos() {
		txtFone.setText("");
		txtNome.setText("");
		txtMatricula.setText("0");
		txtNome.requestFocus();
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmContatos frame = new FrmContatos();
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
	public FrmContatos() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				limparCampos();
			}
		});
		setTitle("Agenda - Contatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 14, 66, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Telefone:");
		lblNewLabel_1.setBounds(10, 42, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(86, 11, 225, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtFone = new JTextField();
		txtFone.setBounds(86, 39, 126, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/* In�cio - C�digo desenvolvido */
				String mens = inserirPessoa();
				JOptionPane.showMessageDialog(null, mens);
				/* Fim - C�digo desenvolvido */
			}
		});
		btnInserir.setBounds(66, 113, 89, 23);
		contentPane.add(btnInserir);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				/* In�cio - C�digo desenvolvido */
				//String dados = listarPessoas();
				//JOptionPane.showMessageDialog(null, dados);
				/* Fim - C�digo desenvolvido */
				
				FrmContatosLista frmLista = new FrmContatosLista();
				frmLista.setLista(lista);
				frmLista.setVisible(true);
			}
		});
		btnListar.setBounds(166, 113, 89, 23);
		contentPane.add(btnListar);
		
		JLabel lblNewLabel_2 = new JLabel("Matr\u00EDcula:");
		lblNewLabel_2.setBounds(10, 68, 66, 14);
		contentPane.add(lblNewLabel_2);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(86, 67, 126, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblDigitarApenasNmeros = new JLabel("Digitar apenas n\u00FAmeros");
		lblDigitarApenasNmeros.setForeground(new Color(255, 0, 255));
		lblDigitarApenasNmeros.setBounds(86, 88, 126, 14);
		contentPane.add(lblDigitarApenasNmeros);
	}
}
