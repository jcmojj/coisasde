package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.SecaoPet;

@Stateless
public class SecaoPetDao extends Dao<SecaoPet> {

	public SecaoPetDao() {
		super(SecaoPet.class);
	}
}
