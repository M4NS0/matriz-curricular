package Escola;

public class Imovel {
	int matricula_imo;
	String rua_imo;
	String cep_imo;
	String bairro_imo;
	String cidade_imo;
	String uf_imo;
	String tamanho_imo;
	String comodos_imo;
	String garagem_imo;
	int valor_imo;
	String tipo_imo;
	String status_imo;
	
	public Imovel () {
		
	}
	/*
	public Imovel (int matriculaImovel, String ruaImovel, String cepImovel,
			String bairroImovel, String cidadeImovel, String ufImovel, 
			String tamanhoImovel, String comodosImovel, String garagemImovel,
			int valorImovel, String tipoImovel, String statusImovel){
		
		this.bairro_imo = bairroImovel;
		this.cep_imo = cepImovel;
		this.cidade_imo = cidadeImovel;
		this.comodos_imo = comodosImovel;
		this.garagem_imo = garagemImovel;
		this.matricula_imo = matriculaImovel;
		this.rua_imo = ruaImovel;
		this.status_imo = statusImovel;
		this.tamanho_imo = tamanhoImovel;
		this.tipo_imo = tipoImovel;
		this.uf_imo = ufImovel;
		this.valor_imo = valorImovel;
		
		
	}
	*/
	public int getMatricula_imo() {
		return matricula_imo;
	}
	public void setMatricula_imo(int matricula_imo) {
		this.matricula_imo = matricula_imo;
	}
	public String getRua_imo() {
		return rua_imo;
	}
	public void setRua_imo(String rua_imo) {
		this.rua_imo = rua_imo;
	}
	public String getCep_imo() {
		return cep_imo;
	}
	public void setCep_imo(String cep_imo) {
		this.cep_imo = cep_imo;
	}
	public String getBairro_imo() {
		return bairro_imo;
	}
	public void setBairro_imo(String bairro_imo) {
		this.bairro_imo = bairro_imo;
	}
	public String getCidade_imo() {
		return cidade_imo;
	}
	public void setCidade_imo(String cidade_imo) {
		this.cidade_imo = cidade_imo;
	}
	public String getUf_imo() {
		return uf_imo;
	}
	public void setUf_imo(String uf_imo) {
		this.uf_imo = uf_imo;
	}
	public String getTamanho_imo() {
		return tamanho_imo;
	}
	public void setTamanho_imo(String tamanho_imo) {
		this.tamanho_imo = tamanho_imo;
	}
	public String getComodos_imo() {
		return comodos_imo;
	}
	public void setComodos_imo(String comodos_imo) {
		this.comodos_imo = comodos_imo;
	}
	public String getGaragem_imo() {
		return garagem_imo;
	}
	public void setGaragem_imo(String garagem_imo) {
		this.garagem_imo = garagem_imo;
	}
	public int getValor_imo() {
		return valor_imo;
	}
	public void setValor_imo(int valor_imo) {
		this.valor_imo = valor_imo;
	}
	public String getTipo_imo() {
		return tipo_imo;
	}
	public void setTipo_imo(String tipo_imo) {
		this.tipo_imo = tipo_imo;
	}
	public String getStatus_imo() {
		return status_imo;
	}
	public void setStatus_imo(String status_imo) {
		this.status_imo = status_imo;
	}
	@Override
	public String toString() {
		return "\tDados do Imóvel:\n" +
			    "\n\t================="  +
			    "\n\tMatrícula: " + matricula_imo 	+
			    "\n\t      Rua: " + rua_imo 		+
	 		    "\n\t   Bairro: " + bairro_imo 		+
			    "\n\t   Cidade: " + cidade_imo 		+
			    "\n\t      CEP: " + cep_imo 		+
			    "\n\t   Cômodo: " + comodos_imo 	+
			    "\n\t  Garagem: " + garagem_imo 	+
			    "\n\t   Status: " + status_imo 		+
			    "\n\t       UF: " + uf_imo 			+
			    "\n\t     Tipo: " + tipo_imo 		+
			    "\n\t    Valor: " + valor_imo 		+
			    "\n\t  Tamanho: " + tamanho_imo;

	}
	
	
}