package br.com.coisasde.loja.model.produto.divisaoPet.tipo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import br.com.coisasde.loja.model.produto.divisao.Pet;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Cachorro extends Pet implements Serializable{
	private static final long serialVersionUID = 1L;
	private static final String tipo = "cachorro";

	public String getTipo() {
		return tipo;
	}	

}
