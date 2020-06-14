package Produtos;

import Materiais.Madeira;

public class Cama extends Madeira{
	boolean casal;
	public Cama(String m, String d, float c, float p, float l, String t) {
		super(m, d, c, p, l, t);

		
	}

	public boolean isCasal() {
		return casal;
	}
	public void setCasal(boolean casal) {
		this.casal = casal;
	}
	@Override
	public String envernizar() {
		
		return 	"- Cama precisa de verniz";
	}
	@Override
	public String toString() {
		return "\nCama"
				+ "\n- Tamanho Casal: " + casal
				+ "\n- Material: " + material
				+ "\n- Tipo de Material: " + tipo
				+ "\n- Descrição: " + descricao
				+ "\n- Custo: " + custo
				+ "\n- Lucro: " + lucro + "\n";
	}
	

}
