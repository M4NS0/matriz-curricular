package ClasseSocial;
import SerHumano.Pessoa;
public class Rico extends Pessoa {
	
	String compra;
	
	public Rico (String n, int i) {
		super(n,i);
	}
	
	public String getCompra() {
		return compra;
	}
	public void setCompra(String compra) {
		this.compra = compra;
	}
	@Override
	public String toString() {
		return super.toString() + "\nSituação: Gastando";
	}
}
