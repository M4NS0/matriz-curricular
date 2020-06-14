import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private double numA;
	private double numB;
	private double calc;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculadora() {
		setBackground(SystemColor.controlShadow);
		setFont(new Font("Dialog", Font.BOLD, 12));
		setForeground(UIManager.getColor("MenuItem.acceleratorSelectionForeground"));
		setTitle("CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 383);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmExibir = new JMenuItem("Exibir");
		mntmExibir.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		mntmExibir.setBackground(UIManager.getColor("ScrollBar.shadow"));
		menuBar.add(mntmExibir);
		
		JMenuItem mntmEditar = new JMenuItem("Editar");
		mntmEditar.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		mntmEditar.setBackground(UIManager.getColor("ScrollBar.shadow"));
		menuBar.add(mntmEditar);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mntmAjuda.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		mntmAjuda.setBackground(UIManager.getColor("ScrollBar.shadow"));
		menuBar.add(mntmAjuda);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("ScrollBar.shadow"));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		
		
		JButton button_3 = new JButton("+");
		buttonGroup.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "+");
				numA = Double.parseDouble(textField.getText().replaceFirst(".$",""));
				calc = numA + numB;
			}
		});
		
		JButton button_4 = new JButton("=");
		buttonGroup.add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField.getText();
				textField.setText(String.valueOf(calc));
			}
		});
		JButton button_5 = new JButton("-");
		buttonGroup.add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "-");
				numA = Double.parseDouble(textField.getText().replaceFirst(".$",""));
				calc = numB - numA;
			}
		});
		
		JButton button_14 = new JButton("/");
		buttonGroup.add(button_14);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "/");
				numA = Double.parseDouble(textField.getText().replaceFirst(".$",""));
				calc = numA / numB;
			}
		});
		
		JButton button_10 = new JButton("*");
		buttonGroup.add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "*");
				numA = Double.parseDouble(textField.getText().replaceFirst(".$",""));
				calc = numA*numB;
			}
		});

		JButton button_2 = new JButton(",");
		buttonGroup.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + ".");
			}
		});
		JButton button_15 = new JButton("←");
		buttonGroup.add(button_15);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
			}
		});
		
		JButton button_16 = new JButton("CE");
		buttonGroup.add(button_16);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText().replaceFirst(".$",""));
			
			}
		});
		
		JButton button_17 = new JButton("C");
		buttonGroup.add(button_17);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		JButton btnNewButton = new JButton("0");
		buttonGroup.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				textField.setText(textField.getText() + "0");
				numB = Double.parseDouble(textField.getText());
			}
		});
		
		JButton button = new JButton("1");
		buttonGroup.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "1");
				numB = Double.parseDouble(textField.getText());
			}
		});
		
		JButton button_1 = new JButton("2");
		buttonGroup.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "2");
				numB = Double.parseDouble(textField.getText());
			}
		});
		
	
		JButton button_6 = new JButton("3");
		buttonGroup.add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "3");
				numB = Double.parseDouble(textField.getText());
			}
		});
		
		JButton button_7 = new JButton("4");
		buttonGroup.add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "4");
				numB = Double.parseDouble(textField.getText());
			}
		});
		
		JButton button_8 = new JButton("5");
		buttonGroup.add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "5");
				numB = Double.parseDouble(textField.getText());
			}
		});
		
		JButton button_9 = new JButton("6");
		buttonGroup.add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "6");
				numB = Double.parseDouble(textField.getText());
			}
		});
		
	
		JButton button_11 = new JButton("7");
		buttonGroup.add(button_11);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "7");
				numB = Double.parseDouble(textField.getText());
			}
		});
		
		JButton button_12 = new JButton("8");
		buttonGroup.add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "8");
				numB = Double.parseDouble(textField.getText());
			}
		});
		
		JButton button_13 = new JButton("9");
		buttonGroup.add(button_13);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "9");
				numB = Double.parseDouble(textField.getText());
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_17, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_17, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
						.addComponent(button_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(83))
		);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setBackground(Color.WHITE);
		textField.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(159, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(31, Short.MAX_VALUE)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
