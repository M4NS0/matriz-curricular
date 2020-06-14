import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisplay;
	private JLabel lblOp;
	
	private float n1, n2, resultado;

	
	public void atribuirValorDisplay(String val) {
		if (!(val.equals(".") && txtDisplay.getText().contains("."))) {
			txtDisplay.setText(txtDisplay.getText() + val);
		}
	}

	public void atribuirOperacao(String op) {
		lblOp.setText(op);
		n1 = Float.parseFloat(txtDisplay.getText());
		txtDisplay.setText("0");
	}
	
	public void calcular() {
		n2 = Float.parseFloat(txtDisplay.getText());
		if (lblOp.getText().equals("+")) {
			resultado = n1 + n2;
		}
		else if (lblOp.getText().equals("-")) {
			resultado = n1 - n2;
		}
		else if (lblOp.getText().equals("/")) {
			resultado = n1 / n2;
		}
		else if (lblOp.getText().equals("x")) {
			resultado = n1 * n2;
		}
		txtDisplay.setText(String.valueOf(resultado));
	}
	
	public void limparDados() {
		n1 = 0;
		n2 = 0;
		resultado = 0;
		lblOp.setText("");
		txtDisplay.setText("0");
	}

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

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		
		setTitle("Calculadora");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				limparDados();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 252, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblCalculadora = new JLabel("Calculadora");
		lblCalculadora.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCalculadora.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblCalculadora);
		
		lblOp = new JLabel("+");
		lblOp.setForeground(Color.RED);
		lblOp.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOp.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblOp);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtDisplay.setText("0");
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JLabel label = new JLabel("");
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirValorDisplay("7");
			}
		});
		panel_1.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirValorDisplay("8");
			}
		});
		panel_1.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirValorDisplay("9");
			}
		});
		panel_1.add(btn9);
		
		JButton btnSomar = new JButton("+");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirOperacao("+");
			}
		});
		panel_1.add(btnSomar);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirValorDisplay("4");
			}
		});
		panel_1.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirValorDisplay("5");
			}
		});
		panel_1.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirValorDisplay("6");
			}
		});
		panel_1.add(btn6);
		
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirOperacao("-");
			}
		});
		panel_1.add(btnSubtrair);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirValorDisplay("1");
			}
		});
		panel_1.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirValorDisplay("2");
			}
		});
		panel_1.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				atribuirValorDisplay("3");
			}
		});
		panel_1.add(btn3);
		
		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirOperacao("/");
			}
		});
		panel_1.add(btnDividir);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirValorDisplay("0");
			}
		});
		panel_1.add(btn0);
		
		JButton btnVirgula = new JButton(",");
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirValorDisplay(".");
			}
		});
		panel_1.add(btnVirgula);
		
		JButton btnLimpar = new JButton("CE");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limparDados();
			}
		});
		panel_1.add(btnLimpar);
		
		JButton btnMult = new JButton("x");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atribuirOperacao("x");
			}
		});
		panel_1.add(btnMult);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		panel_2.add(btnResultado);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel_2.add(btnSair);
	}

	public JTextField getTxtDisplay() {
		return txtDisplay;
	}
	public JLabel getLblOp() {
		return lblOp;
	}
}
