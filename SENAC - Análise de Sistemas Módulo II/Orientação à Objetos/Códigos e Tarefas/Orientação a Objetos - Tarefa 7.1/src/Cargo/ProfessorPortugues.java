package Cargo;

import Administracao.Profissional;
import Dominios.Portugues;


public class ProfessorPortugues extends Profissional implements Portugues {

	public ProfessorPortugues(String n, String e) {
		
	}

	public ProfessorPortugues() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void redigirRedacao() {
		System.out.println("- Redige Redação");
		
	}

	@Override
	public void revisarTextos() {
		System.out.println("- Revisa Textos");
	}
	
	
}
