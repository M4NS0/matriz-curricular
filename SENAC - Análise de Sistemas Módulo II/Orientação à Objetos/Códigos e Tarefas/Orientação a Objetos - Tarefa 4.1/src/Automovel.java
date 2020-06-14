
public class Automovel {
	int id;
	String fabricante;
	String modelo;
	String cor;
	String placa;
	String chassi;
	int ano;
	
	
	
	public Automovel () {	
	}
	public Automovel(int id, String fabricante, String modelo, String cor, String placa, String chassi, int ano) {
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.chassi = chassi;
		this.ano = ano;
		
				
	}
	
	public int getId (){ 
		return id;
	}
	public void setId (int id) { 
		this.id = id;
	}
		
	public String getFabricante() {
		return fabricante;
		
	}
	public void setFabricante (String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getModelo() { 
		return modelo;
	}
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() { 
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getChassi() {
		return chassi; 
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public int getAno () { 
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return 	"          ID: " + id + 
				"\nFabricante: " + fabricante + 
				"\n    Modelo: " + modelo + 
				"\n       Cor: " + cor + 
				"\n     Placa: " + placa + 
				"\n    Chassi: " + chassi + 
				"\n       Ano: " + ano +
				"\n==========================\n";
	}
	
	
	
	
}
