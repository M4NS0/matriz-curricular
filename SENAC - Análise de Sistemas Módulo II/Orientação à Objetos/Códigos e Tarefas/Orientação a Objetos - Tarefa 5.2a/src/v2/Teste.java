package v2;

// import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {
		// ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
		Cachorro dog = new Cachorro("Arold","Bulldog");
		dog.setFala("ArfArfGrrrrr");
		// listaAnimais.add(dog);
		System.out.println(dog);
		
		Gato cat = new Gato("Ozorio","Persa");
		cat.setFala("SSSSSSss!!");
		// listaAnimais.add(cat);
		System.out.println(cat);
		
		
	}
}
