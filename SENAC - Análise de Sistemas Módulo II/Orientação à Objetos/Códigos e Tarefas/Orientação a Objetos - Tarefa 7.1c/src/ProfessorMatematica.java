

import javax.swing.JOptionPane;

public class ProfessorMatematica extends Profissional implements DominioMatematica{

	@Override
	public void realizarCalculos() {
		JOptionPane.showMessageDialog(null, "Professor de Matem�tica est� realizando c�lculos!");		
	}
	
	@Override
	public String toString() {
		return "Professor de Matem�tica: " + super.toString();
	}

}
