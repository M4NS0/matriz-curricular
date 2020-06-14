import java.util.Date;

public class TesteMedicamento {

	public static void main(String[] args) {
		
		Date d = new Date("2019/10/05");
		//d.setYear(d.getYear() - 1);

		/* Construtor 01 */
		Medicamento m1 = new Medicamento();
		
		System.out.println(m1);
		
		m1.setId(1);
		m1.setNome("Dorflex");
		m1.setPrincipioAtivo("Dipirona");
		m1.setQtdeEstoque(10);
		m1.setDataValidade(d);
		
		System.out.println(m1);
		
		/* Construtor 02 */
		Medicamento m2 = new Medicamento(2, "Xarope", "Gripe ...", "Cx", 20, new Date());
		System.out.println(m2);
		
		/* Construtor 03 */
		Medicamento m3 = new Medicamento("Benegripe");
		System.out.println(m3);
		
	}
	
}
