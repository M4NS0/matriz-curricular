import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MinhaPrimeiraJanela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinhaPrimeiraJanela frame = new MinhaPrimeiraJanela();
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
	public MinhaPrimeiraJanela() {
		setTitle("Meu Primeiro Programa GUI");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 113);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnCliqueAqui = new JButton("Clique Aqui !!!!!");
		btnCliqueAqui.setForeground(Color.BLUE);
		btnCliqueAqui.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCliqueAqui.setBackground(Color.GREEN);
		btnCliqueAqui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Seja bem vindo ao mundo da Interface Gráfica!!!");
			}
		});
		contentPane.add(btnCliqueAqui, BorderLayout.SOUTH);
		
		JLabel lblDigiteOSeu = new JLabel("Digite o seu nome:");
		contentPane.add(lblDigiteOSeu, BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Olá " + txtNome.getText());
				imprimirTeste("Seja bem vindo ");
			}
		});
		contentPane.add(btnNewButton, BorderLayout.EAST);
		
		txtNome = new JTextField();
		contentPane.add(txtNome, BorderLayout.CENTER);
		txtNome.setColumns(10);
	}
	
	public void imprimirTeste(String mens) {
		JOptionPane.showMessageDialog(null, mens + txtNome.getText());
		
	}
	

}
