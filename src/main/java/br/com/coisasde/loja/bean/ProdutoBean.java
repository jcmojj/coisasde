package br.com.coisasde.loja.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.coisasde.loja.daos.novos.ProdutoDao;
import br.com.coisasde.loja.daos.novos.SecaoPetDao;
import br.com.coisasde.loja.daos.novos.TipoProdutoPetDao;
import br.com.coisasde.loja.model.produto.Produto;
import br.com.coisasde.loja.model.produto.SecaoPet;
import br.com.coisasde.loja.model.produto.TipoProdutoPet;

@Named
@RequestScoped
public class ProdutoBean {
	private Produto produto = new Produto();
	private List<Integer> secoesPetId = new ArrayList<>();
	private Integer tipoProdutoPetId = 0;

	@Inject
	private ProdutoDao produtoDao;
	@Inject
	private SecaoPetDao secaoPetDao;
	@Inject
	private TipoProdutoPetDao tipoProdutoPetDao;
	
	//Persistencia
	@Transactional
	public void salvar() {
		for(Integer secaoId : secoesPetId) {
			produto.getSecoesPet().add(new SecaoPet(secaoId));
		}
		produto.setTipoProdutoPet(new TipoProdutoPet(tipoProdutoPetId));
		produtoDao.adiciona(produto);
		this.produto = new Produto();
		this.secoesPetId = new ArrayList<>();
		this.tipoProdutoPetId = 0;

	}
	//Getters and Setters

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public List<Integer> getSecoesPetId() {
		return secoesPetId;
	}

	public void setSecoesPetId(List<Integer> secoesPetId) {
		this.secoesPetId = secoesPetId;
	}

	public Integer getTipoProdutoPetId() {
		return tipoProdutoPetId;
	}

	public void setTipoProdutoPetId(Integer tipoProdutoPetId) {
		this.tipoProdutoPetId = tipoProdutoPetId;
	}
	// OUTROS
	public List<SecaoPet> getSecoesPet() {
		return secaoPetDao.listaTodos();
	}
	public List<TipoProdutoPet> getTiposProdutoPet(){
		return tipoProdutoPetDao.listaTodos();
	}

}