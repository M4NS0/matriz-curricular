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
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;

public class Janelinha extends JFrame {

	private JPanel contentPane;
	private JTextField txtCampo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janelinha frame = new Janelinha();
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
	public Janelinha() {
		setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("janela para clicar no boton do luys");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 126);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JButton btnButtonDeLuys = new JButton("novo boton de Luys");
		btnButtonDeLuys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Aha! você apertou o boton do Luys");
			}
		});
		contentPane.add(btnButtonDeLuys, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, txtCampo.getText());
			}
		});
		contentPane.add(btnNewButton, BorderLayout.EAST);
		
		txtCampo = new JTextField();
		contentPane.add(txtCampo, BorderLayout.CENTER);
		txtCampo.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.NORTH);
	}

}
