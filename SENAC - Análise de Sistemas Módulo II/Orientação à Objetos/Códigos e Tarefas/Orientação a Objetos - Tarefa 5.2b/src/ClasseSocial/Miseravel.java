package ClasseSocial;
import SerHumano.Pessoa;

public class Miseravel extends Pessoa{
	
	String pede;
	
	public Miseravel (String n, int i) {
		super(n,i);
	}
	
	public String getPede() {
		return pede;
	}
	public void setPede(String pede) {
		this.pede = pede;
	}
	@Override
	public String toString() {
		return super.toString() + "\nSituação: Mendigando\n";
	}
	
}
