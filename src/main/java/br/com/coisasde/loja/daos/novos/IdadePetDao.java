package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.IdadePet;

@Stateless
public class IdadePetDao extends Dao<IdadePet> {

	public IdadePetDao() {
		super(IdadePet.class);
	}
}
