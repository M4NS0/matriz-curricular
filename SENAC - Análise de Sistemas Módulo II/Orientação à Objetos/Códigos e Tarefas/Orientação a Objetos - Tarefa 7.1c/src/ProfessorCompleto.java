

import javax.swing.JOptionPane;

public class ProfessorCompleto extends Profissional
		implements DominioInformatica, DominioPortugues, DominioMatematica {

	@Override
	public void realizarCalculos() {
		JOptionPane.showMessageDialog(null, "teste realizarCalculos");
	}

	@Override
	public void redigirRedacao() {
		JOptionPane.showMessageDialog(null, "teste redigirRedacao");

	}

	@Override
	public void revisarTextos() {
		JOptionPane.showMessageDialog(null, "teste revisarTextos");

	}

	@Override
	public void formatarComputador() {
		JOptionPane.showMessageDialog(null, "teste formatarComputador");

	}

	@Override
	public void treinarUsuario() {
		JOptionPane.showMessageDialog(null, "teste treinarUsuario");

	}
	@Override
	public String toString() {
		return "Professor Completo: " + super.toString();
	}

}
