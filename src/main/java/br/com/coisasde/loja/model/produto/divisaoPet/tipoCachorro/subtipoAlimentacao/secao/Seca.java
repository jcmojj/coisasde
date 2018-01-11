package br.com.coisasde.loja.model.produto.divisaoPet.tipoCachorro.subtipoAlimentacao.secao;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import br.com.coisasde.loja.model.produto.divisaoPet.tipoCachorro.subtipo.Alimentacao;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Seca extends Alimentacao implements Serializable{
	private static final long serialVersionUID = 1L;
	private static final String secao = "seca";
//	private Marca marca;
//	private BigDecimal pesoRacao;
//	private TipoRacao tipoRacao;
//	private TipoCachorro tipoCachorro;
//	private PorteCachorro porteCachorro;
//	private RacaCachorro racaCachorro;
	
	
	public static String getSecao() {
		return secao;
	}

	

}
