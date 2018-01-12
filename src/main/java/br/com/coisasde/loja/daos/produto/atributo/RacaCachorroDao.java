package br.com.coisasde.loja.daos.produto.atributo;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.atributo.RacaCachorro;

@Stateless
public class RacaCachorroDao extends Dao<RacaCachorro> {

	public RacaCachorroDao() {
		super(RacaCachorro.class);
	}
}
