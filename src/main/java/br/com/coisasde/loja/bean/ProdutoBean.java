package br.com.coisasde.loja.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.coisasde.loja.daos.ProdutoDao;
import br.com.coisasde.loja.daos.novos.SecaoPetDao;
import br.com.coisasde.loja.model.produto.Produto;
import br.com.coisasde.loja.model.produto.SecaoPet;

@Named
@RequestScoped
public class ProdutoBean {
	private Produto produto = new Produto();
	private List<Integer> secoesPetId = new ArrayList<>();

	@Inject
	private ProdutoDao produtoDao;
	@Inject
	private SecaoPetDao secaoPetDao;
	
	@Transactional
	public void save() {
		for(Integer secaoId : secoesPetId) {
			produto.getSecoesPet().add(new SecaoPet(secaoId));
		}
		produtoDao.adiciona(produto);
		this.produto = new Produto();
		this.secoesPetId = new ArrayList<>();

	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<SecaoPet> getSecoesPet() {
		return secaoPetDao.listaTodos();
	}

	public List<Integer> getSecoesPetId() {
		return secoesPetId;
	}

	public void setSecoesPetId(List<Integer> secoesPetId) {
		this.secoesPetId = secoesPetId;
	}

}