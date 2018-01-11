package br.com.coisasde.loja.model.produto.divisaoPet.tipoCachorro.subtipo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import br.com.coisasde.loja.model.produto.divisaoPet.tipo.Cachorro;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Alimentacao extends Cachorro implements Serializable{
	private static final long serialVersionUID = 1L;
	private static final String subtipo = "alimentacao";
	
	
	
	public static String getSubtipo() {
		return subtipo;
	}


}
