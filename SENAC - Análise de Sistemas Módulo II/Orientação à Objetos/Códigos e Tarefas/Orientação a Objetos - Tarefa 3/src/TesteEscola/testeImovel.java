package TesteEscola;

import Escola.Imovel;

public class testeImovel {
	public static void main(String[] args) {

		Imovel imovel1 = new Imovel();
		
		imovel1.setTipo_imo("Até 120 metros");
		imovel1.setStatus_imo("à Venda");
		imovel1.setCidade_imo("Goiânia");
		imovel1.setUf_imo("GO");
		imovel1.setRua_imo("Rua Alameda Botafogo");
		imovel1.setBairro_imo("Centro");
		imovel1.setCep_imo("74030-020");
		imovel1.setComodos_imo("3 quartos, 1 suíte");
		imovel1.setGaragem_imo("1 garagem");
		imovel1.setTamanho_imo("127 m²");
		imovel1.setValor_imo(250000);
		
		System.out.println(	"\n    Tipo: " + imovel1.getTipo_imo() +
							"\n  Status: " + imovel1.getStatus_imo() + 
							"\n  Cidade: " + imovel1.getCidade_imo() +
							"\n      UF: " + imovel1.getUf_imo() +
							"\n     Rua: " + imovel1.getRua_imo() +
							"\n  Bairro: " + imovel1.getBairro_imo() +
							"\n     CEP: " + imovel1.getCep_imo() +
							"\n Comodos: " + imovel1.getComodos_imo() +
							"\n Garagem: " + imovel1.getGaragem_imo() + 
							"\n Tamanho: " + imovel1.getTamanho_imo() + 
							"\n   Valor: " + imovel1.getValor_imo());
	}
}
