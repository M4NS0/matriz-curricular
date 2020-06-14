package v2;

public class Tecnico extends Assistente {
	private float bonus;

	public Tecnico(int m, String n, String d) {
		super(m, n, d);
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "\nBonus: " + bonus;
	}
}
