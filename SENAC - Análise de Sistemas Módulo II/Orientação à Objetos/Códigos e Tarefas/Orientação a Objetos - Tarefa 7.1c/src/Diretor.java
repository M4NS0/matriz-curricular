

import javax.swing.JOptionPane;

public class Diretor extends Profissional implements DominioAdm{

	@Override
	public void organizarTarefas() {
		JOptionPane.showMessageDialog(null, "O diretor est� organizando as Tarefas!");
	}

	@Override
	public void designarCargos() {
		JOptionPane.showMessageDialog(null, "O diretor est� designando os cargos da empresa!");
	}

	@Override
	public void contratarFuncionarios(int qtde, String cargo) {
		JOptionPane.showMessageDialog(null, "O diretor est� contratando novos funcion�rios!");
	}
	
	@Override
	public String toString() {
		return "Diretor: " + super.toString();
	}

}
