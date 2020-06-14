package v2;

public class Administrativo extends Assistente{
	
	private String turno;
	private float adicional;
	
	public Administrativo (int m, String n, String d) {
		super(m,n,d);
	}
	
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public float getAdincional () {
		return adicional;
	}
	public void setAdicional(float adicional) {
		this.adicional = adicional;
	}
	@Override
	public String toString() {
		return super.toString() + "\nTurno: " + turno + "\nAdicional: " + adicional;
	}
	
	
}
