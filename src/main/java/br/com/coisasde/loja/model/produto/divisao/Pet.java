package br.com.coisasde.loja.model.produto.divisao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import br.com.coisasde.loja.model.produto.Produto;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pet extends Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	private static final String divisao = "pet";

	public String getDivisao() {
		return divisao;
	}
	
}
