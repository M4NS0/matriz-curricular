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
import javax.swing.JSpinner;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrmContatos extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtFone;

	private JTextField txtMatricula;
	private JButton btnGravar;
	
	private ArrayList<Pessoa> lista;
	private int indice;
	
	public String inserirPessoa() {
		try {
			Pessoa p = new Pessoa();
			p.setNome(txtNome.getText());
			p.setTelefone(txtFone.getText());
			p.setMatricula(Integer.parseInt(txtMatricula.getText()));
			lista.add(p);
			limparCampos();
			GerArquivo.gravarArquivo(p.toString(), true);
			return "Pessoa inserida com sucesso";
		} catch (Exception e) {
			return "Erro ao Inserir! Favor digitar apenas números na matrícula!";
		}
	}
	
	public String alterarPessoa() {
		try {
			Pessoa p = lista.get(indice);
			p.setNome(txtNome.getText());
			p.setTelefone(txtFone.getText());
			p.setMatricula(Integer.parseInt(txtMatricula.getText()));
			GerArquivo.gravarArquivo(lista);
			return "Pessoa alterada com sucesso";
		} catch (Exception e) {
			return "Erro ao Alterar! Favor digitar apenas números na matrícula!";
		}
	}

	public void limparCampos() {
		txtFone.setText("");
		txtNome.setText("");
		txtMatricula.setText("0");
		txtNome.requestFocus();
	}
	
	
	/**
	 * Create the frame.
	 */
	public FrmContatos(ArrayList<Pessoa> lista) {
		this.lista = lista;
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				if (btnGravar.getText().equals("Inserir")) {
					limparCampos();
				}
			}
		});
		setTitle("Agenda - Contatos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (btnGravar.getText().equals("Inserir")) {
					String mens = inserirPessoa();
					JOptionPane.showMessageDialog(null, mens);
				}
				else {
					String mens = alterarPessoa();
					JOptionPane.showMessageDialog(null, mens);
					setVisible(false);
				}

			}
		});
		btnGravar.setBounds(66, 113, 89, 23);
		contentPane.add(btnGravar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancelar.setBounds(183, 113, 89, 23);
		contentPane.add(btnCancelar);
		
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
	public JButton getBtnGravar() {
		return btnGravar;
	}
	public JTextField getTxtNome() {
		return txtNome;
	}
	public JTextField getTxtFone() {
		return txtFone;
	}
	public JTextField getTxtMatricula() {
		return txtMatricula;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
}
