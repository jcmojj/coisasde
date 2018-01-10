package br.com.coisasde.loja.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.coisasde.loja.daos.ProdutoDao;
import br.com.coisasde.loja.model.produto.Produto;

@Named
@RequestScoped
public class AdminProdutoBean {
	private Produto produto = new Produto();
	
	@Inject
	private ProdutoDao dao;
	
	@Transactional
	public void salvar() {
		dao.salvar(produto);
		System.out.println("Produto salvo com sucesso" + produto);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}