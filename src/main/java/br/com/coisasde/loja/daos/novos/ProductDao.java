package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.Product;

@Stateless
public class ProductDao extends Dao<Product> {

	public ProductDao() {
		super(Product.class);
	}
}
