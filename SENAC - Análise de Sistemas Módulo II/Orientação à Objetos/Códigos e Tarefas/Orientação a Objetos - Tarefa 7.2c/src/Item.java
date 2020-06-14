

import javax.swing.JOptionPane;

public class Item {
	private String nome;
	public void lavar(){
		JOptionPane.showMessageDialog(null, "Lavando");
	}
	public void encerar() {
		JOptionPane.showMessageDialog(null, "Encerando");
	}
	public void aspirar() {
		JOptionPane.showMessageDialog(null, "Aspirando");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
