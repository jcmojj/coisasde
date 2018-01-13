package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.Produto;

@Stateless
public class ProductDao extends Dao<Produto> {

	public ProductDao() {
		super(Produto.class);
	}
}
