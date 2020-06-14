
public class ExceçaoEncadeada {
	public static void main(String[] args) {
		try {
			metodo1();
		} catch (Exception exceçao) {
			
			exceçao.printStackTrace();
		}
	}

	public static void metodo1() throws Exception {
		try {
			metodo2();
		} 
		catch (Exception exceçao) {
			throw new Exception("Exceção lançada no metodo1", exceçao);
		}
	}

	public static void metodo2() throws Exception {
		try {
			metodo3();
		} 
		catch (Exception exceçao) {
			throw new Exception("Exceção lançada no metodo2", exceçao);
		}
	}

	public static void metodo3() throws Exception {

		throw new Exception("Exceção lançada no metodo3");
	}
}
