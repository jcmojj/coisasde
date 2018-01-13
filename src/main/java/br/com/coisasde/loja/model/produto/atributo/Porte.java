package br.com.coisasde.loja.model.produto.atributo;

public enum Porte {
	MINIATURA("Miniatura"),
	PEQUENO("Pequeno"),
	MEDIO("Médio"),
	GRANDE("Grande"),
	GIGANTE("Gigante");
	
	private String porte;
	Porte(String porte){
		this.porte = porte;
	}
}
