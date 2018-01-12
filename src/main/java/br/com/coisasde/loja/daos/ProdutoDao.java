package br.com.coisasde.loja.daos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.model.produto.Produto;

@Stateless
public class ProdutoDao extends Dao<Produto> {

	public ProdutoDao() {
		super(Produto.class);
	}
}
