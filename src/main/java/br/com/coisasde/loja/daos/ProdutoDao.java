package br.com.coisasde.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.coisasde.loja.model.produto.Produto;

public class ProdutoDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void salvar(Produto produto) {
		manager.persist(produto);
	}
}
