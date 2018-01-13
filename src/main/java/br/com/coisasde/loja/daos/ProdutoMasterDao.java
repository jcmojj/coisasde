package br.com.coisasde.loja.daos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.model.produto.ProdutoMaster;

@Stateless
public class ProdutoMasterDao extends Dao<ProdutoMaster> {

	public ProdutoMasterDao() {
		super(ProdutoMaster.class);
	}
}
