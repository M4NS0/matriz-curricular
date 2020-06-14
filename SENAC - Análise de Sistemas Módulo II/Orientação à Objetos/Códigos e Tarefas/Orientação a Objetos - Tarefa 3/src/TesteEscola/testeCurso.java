package TesteEscola;

import Escola.Curso;

public class testeCurso {
	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setNome("Análise e Desenvolvimento de Sistemas");
		curso1.setCodigo(666666);
		curso1.setCargaHora(333);
		curso1.setPreRequisito("Nenhum");
		curso1.setValor(666.66);
		
		System.out.println(	"\n      Nome: " + curso1.getNome() + 
							"\n       Cod: " + curso1.getCodigo() + 
							"\n     Carga: " + curso1.getCargaHora() + 
							"\nRequisitos: " + curso1.getPreRequisito() + 
							"\n     Valor: " + curso1.getValor());
		
	}
}
