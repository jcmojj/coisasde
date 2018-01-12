package br.com.coisasde.loja.daos.produto;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.GatoAlimentacaoPetisco;

@Stateless
public class GatoAlimentacaoPetiscoDao extends Dao<GatoAlimentacaoPetisco> {

	public GatoAlimentacaoPetiscoDao() {
		super(GatoAlimentacaoPetisco.class);
	}
}