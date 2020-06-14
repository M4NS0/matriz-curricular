package interfaces;

public class Triatleta extends Pessoa implements Ciclistas, Nadadores, Corredores {

	public Triatleta(String nome) {
		this.nome = nome;
	}

	public void pedalar() {
		System.out.println(this.nome + "está pedalando!");
	}

	public void nadar() {
		System.out.println(this.nome + "está nadando!");
	}

	public void correr() {
		System.out.println(this.nome + "está correndo!");
	}

	public void aquecer() {
		System.out.println(this.nome + "está aquecendo!");
	}

	public void alongar() {
		System.out.println(this.nome + "está alongando!");
	}

	public void competir() {
		System.out.println(this.nome + "está competindo!");
	}
}
