package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.TipoProdutoPet;

@Stateless
public class TipoProdutoPetDao extends Dao<TipoProdutoPet> {

	public TipoProdutoPetDao() {
		super(TipoProdutoPet.class);
	}
}

