package br.com.coisasde.loja.model.produto.atributo;

public enum Idade {
	FILHOTE("Filhote"),
	ADULTO("Adulto"),
	SENIOR("Sênior");
	
	private String idade;

	Idade(String idade) {
		this.idade = idade;
	}	
	
}
