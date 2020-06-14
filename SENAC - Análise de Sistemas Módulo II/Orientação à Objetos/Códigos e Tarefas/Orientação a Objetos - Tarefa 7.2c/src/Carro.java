
import javax.swing.JOptionPane;

public class Carro extends Item {
	
	public void lavar(boolean motor){
		JOptionPane.showMessageDialog(null, "lavando motor = " + motor);
	}
	
	public void lavar(boolean motor, boolean bancos){
		JOptionPane.showMessageDialog(null, "lavando motor = " + motor);
		JOptionPane.showMessageDialog(null, "lavando bancos = " + bancos);
	}
	
	public void lavar(boolean motor, boolean bancos, boolean portaMalas){
		JOptionPane.showMessageDialog(null, "lavando motor = " + motor);
		JOptionPane.showMessageDialog(null, "lavando bancos = " + bancos);
		JOptionPane.showMessageDialog(null, "lavando porta malas = " + portaMalas);
	}
	
	@Override
	public String toString() {
		return "Carro [Nome = " + getNome() + "]";
	}
	
}
