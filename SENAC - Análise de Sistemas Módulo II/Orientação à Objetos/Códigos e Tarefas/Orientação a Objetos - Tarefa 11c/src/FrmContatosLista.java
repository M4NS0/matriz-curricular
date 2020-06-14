import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class FrmContatosLista extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	
	private ArrayList<Pessoa> lista;
	

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
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				
				modelo.setRowCount(0);
				for (Pessoa p : lista) {
					modelo.addRow(new Object[] {
						p.getMatricula(), 
						p.getNome(), 
						p.getTelefone()
					});
				}
				
			}
		});
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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
	}

	public ArrayList<Pessoa> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Pessoa> lista) {
		this.lista = lista;
	}

}
