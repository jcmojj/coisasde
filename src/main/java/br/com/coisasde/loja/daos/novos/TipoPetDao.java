package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.TipoPet;

@Stateless
public class TipoPetDao extends Dao<TipoPet> {

	public TipoPetDao() {
		super(TipoPet.class);
	}
}

