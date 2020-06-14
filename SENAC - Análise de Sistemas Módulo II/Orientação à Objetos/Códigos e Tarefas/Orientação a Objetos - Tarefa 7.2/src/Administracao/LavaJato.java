package Administracao;

import java.util.ArrayList;

import Itens.Item;


public class LavaJato {
	protected int op;
	public static ArrayList<Item> lista = new ArrayList<Item>();
	
	public LavaJato() {
		
	}
	public int getOp() {
		return op;
	}
	public void setOp(int op) {
		this.op = op;
	}
	
	public ArrayList<Item> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Item> lista) {
		LavaJato.lista = lista;
	}
	
	
	public void inserir() {
		
	}
	public void listar () {
		
	}
	public void testar () {
		
	}
	@Override
	public String toString() {
		return super.toString() +
				"LavaJato \nLista=" + lista + 
				"\n getOp():" + getOp() + 
				"\n getLista():" + getLista();
	}
	
	
	
}
