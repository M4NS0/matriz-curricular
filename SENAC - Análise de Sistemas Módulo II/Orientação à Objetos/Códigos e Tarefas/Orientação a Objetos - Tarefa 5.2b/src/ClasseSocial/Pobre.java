package ClasseSocial;
import SerHumano.Pessoa;

public class Pobre extends Pessoa {
	
	String trabalho;
	
	public Pobre (String n, int i) {
		super(n,i);
	}
	
	public String getTrabalho() {
		return trabalho;
	}
	
	public void setTrabalho(String trabalho) {
		this.trabalho = trabalho;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSituação: Trabalhando \n";
		
	}
	
}
