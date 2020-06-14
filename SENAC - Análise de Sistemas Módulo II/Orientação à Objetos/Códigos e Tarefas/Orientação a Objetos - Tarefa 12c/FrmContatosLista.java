import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmContatosLista extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	
	private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmContatosLista frame = new FrmContatosLista();
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
	public FrmContatosLista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				preecherDataTable(true);
			}
		});
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Lista de Contatos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
		
		
		
		scrollPane = new JScrollPane(table = new JTable());
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Matr\u00EDcula", "Nome", "Telefone"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
		table.getColumnModel().getColumn(1).setPreferredWidth(250);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		scrollPane.setViewportView(table);
		
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrmContatos frmCadastro = new FrmContatos(lista);
				frmCadastro.getBtnGravar().setText("Inserir");
				frmCadastro.setVisible(true);
			}
		});
		panel.add(btnInserir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int indice = table.getSelectedRow();
				if (indice >= 0) {
					FrmContatos frmCadastro = new FrmContatos(lista);
					frmCadastro.getBtnGravar().setText("Alterar");
					
					Pessoa p =  lista.get(indice);
					
					frmCadastro.getTxtNome().setText(p.getNome());
					frmCadastro.getTxtMatricula().setText(String.valueOf(p.getMatricula()));
					frmCadastro.getTxtFone().setText(p.getTelefone());
					frmCadastro.setIndice(indice);
					
					frmCadastro.setVisible(true);
				}
				
			}
		});
		panel.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int indice = table.getSelectedRow();
				if (indice >= 0) {
					lista.remove(indice);
					try {
						GerArquivo.gravarArquivo(lista);
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null, "Falha ao gravar os dados da agenda!");
					}
					preecherDataTable(false);
				}
			}
		});
		panel.add(btnExcluir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel.add(btnSair);
	}

	protected void preecherDataTable(boolean lerArquivo) {
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		
		modelo.setRowCount(0);
		if (lerArquivo == true) {
			try {
				lista = new ArrayList<Pessoa>();
				GerArquivo.lerArquivo(lista);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Falha ao ler os dados da agenda!");
			}
		}
		for (Pessoa p : lista) {
			modelo.addRow(new Object[] {
				p.getMatricula(), 
				p.getNome(), 
				p.getTelefone()
			});
		}
	}

	public ArrayList<Pessoa> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Pessoa> lista) {
		this.lista = lista;
	}

}
