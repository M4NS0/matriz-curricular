import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmContatosLista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	
	private ArrayList<Animais> lista;
	private JButton btnApagaLinha;
	private DefaultTableModel modelo;

	
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
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(255, 255, 255));
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {
				
				modelo = (DefaultTableModel) table.getModel();
				
				modelo.setRowCount(0);
				for (Animais p : lista) {
					modelo.addRow(new Object[] {
						p.getId(), 
						p.getNome(), 
						p.getTipo(),
						p.getRaca(),
						p.getCor(),
						p.getPeso(),
						p.getAltura(),
						p.getAnoNascimento()
					});
				}
				
				
			}
		});
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1038, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel titulo = new JLabel("Lista Animais");
		titulo.setForeground(new Color(51, 51, 51));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(titulo, BorderLayout.NORTH);
		
		JPanel painel = new JPanel();
		painel.setBackground(new Color(51, 51, 51));
		contentPane.add(painel, BorderLayout.CENTER);
		painel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane(table = new JTable());
		scrollPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setForeground(new Color(255, 255, 255));
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Nome", "Tipo", "Raça", "Cor", "Peso", "Altura", "Ano de Nascimento"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				//return columnEditables[column];
				return true;
			}
		});
		
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.getColumnModel().getColumn(6).setPreferredWidth(80);
		table.getColumnModel().getColumn(7).setPreferredWidth(80);
		
		scrollPane.setViewportView(table);
		
		painel.add(scrollPane, BorderLayout.CENTER);
		
		btnApagaLinha = new JButton("Apaga Linha");
		btnApagaLinha.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(table.getSelectedRow() != -1) {
		               // remove selected row from the model
		               modelo.removeRow(table.getSelectedRow());
		               JOptionPane.showMessageDialog(null, "Linha apagada com sucesso!");
				}
			}
		});
		contentPane.add(btnApagaLinha, BorderLayout.SOUTH);
	}

	public ArrayList<Animais> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Animais> lista) {
		this.lista = lista;
	}
	

}
