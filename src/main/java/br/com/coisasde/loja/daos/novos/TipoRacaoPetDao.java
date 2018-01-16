package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.TipoRacaoPet;

@Stateless
public class TipoRacaoPetDao extends Dao<TipoRacaoPet> {

	public TipoRacaoPetDao() {
		super(TipoRacaoPet.class);
	}
}
