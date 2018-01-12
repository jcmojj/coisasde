package br.com.coisasde.loja.daos.produto;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.CachorroAlimentacaoPetisco;

@Stateless
public class CachorroAlimentacaoPetiscoDao extends Dao<CachorroAlimentacaoPetisco> {

	public CachorroAlimentacaoPetiscoDao() {
		super(CachorroAlimentacaoPetisco.class);
	}
}
