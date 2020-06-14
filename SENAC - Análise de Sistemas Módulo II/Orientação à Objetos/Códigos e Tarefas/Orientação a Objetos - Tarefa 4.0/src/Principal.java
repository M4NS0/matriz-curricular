import java.util.Date;

public class Principal {
	public static void main(String[] args) {
		
		Medicamento medicamento1 = new Medicamento();
		medicamento1.setNome("Canabidiol");
		medicamento1.setId(696969);
		medicamento1.setPrincipioAtivo("CDB");
		medicamento1.setUnd("não declarado");
		medicamento1.setQuantidadeEstoque(55);
		
		//Date data = new Date();    // pega a data de hoje 
		
		Date data = new Date();
		data.setYear(data.getYear() -1);	// pacote depreciado - quando ja existe uma ferramenta mais nova
		data.setYear(2019);
		data.setMonth(10);
		medicamento1.setDataValidade(data);
		
		System.out.println(	"\n============================================\n" +
							"\n      Nome: " + medicamento1.getNome() +
							"\n        ID: " + medicamento1.getId() +
							"\n       P.A: " + medicamento1.getPrincipioAtivo() + 
							"\n       UND: " + medicamento1.getUnd() + 
							"\n   Estoque: " + medicamento1.getQuantidadeEstoque() + 
							"\n  Validade: " + medicamento1.getDataValidade()+
							"\n");
		
		Medicamento medicamento2 = new Medicamento(3535,"Brunol", "zero", 15, data, "THC");
		
		
		System.out.println(	"\n============================================\n" +
							"\n      Nome: " + medicamento2.getNome() +
							"\n        ID: " + medicamento2.getId() +
							"\n       P.A: " + medicamento2.getPrincipioAtivo() + 
							"\n       UND: " + medicamento2.getUnd() + 
							"\n   Estoque: " + medicamento2.getQuantidadeEstoque() + 
							"\n  Validade: " + medicamento2.getDataValidade()+
							"\n");
		
	}
}
