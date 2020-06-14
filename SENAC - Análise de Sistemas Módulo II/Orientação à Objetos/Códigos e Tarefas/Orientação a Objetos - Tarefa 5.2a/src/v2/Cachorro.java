package v2;

public class Cachorro extends Animal {
	
	String fala;
	
	public Cachorro (String n, String r) {
		super(n,r);
	}
	public String getFala() {
		return fala;
	}
	public void setFala(String fala) {
		this.fala = fala;
	}
	@Override
	public String toString() {
		return super.toString() + "\n- " + fala;
	}

}
