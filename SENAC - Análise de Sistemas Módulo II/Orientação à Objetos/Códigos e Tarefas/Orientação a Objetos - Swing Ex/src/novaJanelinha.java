import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class novaJanelinha extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					novaJanelinha frame = new novaJanelinha();
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
	public novaJanelinha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 177, 436, 86);
		panel_1.add(panel);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(37, 24, 114, 25);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(193, 24, 114, 25);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(91, 61, 114, 25);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(237, 94, 114, 25);
		panel_1.add(btnNewButton_6);
	}
}
