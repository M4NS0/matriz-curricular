

public class Moto extends Item {
	
	public void lavar(boolean motor){
		System.out.println("Lavando motor = " + motor);
	}

	@Override
	public String toString() {
		return "Moto [Nome = " + getNome() + "]";
	}
}
