package interfaces;

import java.util.Date;

public class Pessoa {

	public String nome;
	public String end;
	public Date data;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public void andar() {
		
	}
	
}
