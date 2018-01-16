package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.RacaCachorro;

@Stateless
public class RacaCachorroDao extends Dao<RacaCachorro> {

	public RacaCachorroDao() {
		super(RacaCachorro.class);
	}
}
