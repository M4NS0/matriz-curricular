import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Point;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class calc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc frame = new calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void disable() {
		textField.setEnabled(false);
		
		
		
	}
	/**
	 * Create the frame.
	 */
	public calc() {
		setLocation(new Point(1000, 1000));
		setResizable(false);
		setType(Type.UTILITY);
		setFont(new Font("Dialog", Font.BOLD, 15));
		setTitle("CALCULADORA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 264, 345);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 23));
		textField.setColumns(10);

		JRadioButton rdbtnOn = new JRadioButton("ON");
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});

		buttonGroup.add(rdbtnOn);

		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
			
		buttonGroup.add(rdbtnOff);

		JButton button = new JButton("CE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + ("CE"));
			}
		});

		JButton button_1 = new JButton("C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});

		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + ("+"));
			}
		});

		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "7");
			}
		});

		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "8");
			}
		});

		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "9");
			}
		});
		JButton button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + ("-"));
			}
		});

		JButton button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "4");
			}
		});
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "5");
			}
		});
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "6");
			}
		});
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + ("*"));

			}
		});
		JButton button_11 = new JButton("1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "1");
			}
		});
		JButton button_12 = new JButton("2");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "2");
			}
		});
		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "3");
				
			}
		});
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + ("/"));
		
			}
		});
		JButton button_15 = new JButton("0");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "0");
			}
		});

		JButton button_16 = new JButton(".");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + ("."));
			}
		});

		JButton button_18 = new JButton("=");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + ("="));
			}
		});
		
	
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(rdbtnOff).addComponent(rdbtnOn))
										.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 51,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 51,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 51,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(button_6,
														GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(button, GroupLayout.PREFERRED_SIZE, 51,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 51,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(button_2,
														GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(button_18, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(12)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(rdbtnOn)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(rdbtnOff))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(button, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(button_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 37,
												GroupLayout.PREFERRED_SIZE))))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_18, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
				.addGap(16)));
		contentPane.setLayout(gl_contentPane);
	}
}
