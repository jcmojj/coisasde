package br.com.coisasde.loja.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.coisasde.loja.daos.novos.NecessitaPreRenderizacaoDeDao;
import br.com.coisasde.loja.daos.novos.ProdutoDao;
import br.com.coisasde.loja.daos.novos.SecaoPetDao;
import br.com.coisasde.loja.daos.novos.TipoPetDao;
import br.com.coisasde.loja.daos.novos.TipoProdutoPetDao;
import br.com.coisasde.loja.daos.novos.TipoRacaoPetDao;
import br.com.coisasde.loja.model.produto.Produto;
import br.com.coisasde.loja.model.produto.novos.NecessitaPreRenderizacaoDe;
import br.com.coisasde.loja.model.produto.novos.SecaoPet;
import br.com.coisasde.loja.model.produto.novos.TipoPet;
import br.com.coisasde.loja.model.produto.novos.TipoProdutoPet;
import br.com.coisasde.loja.model.produto.novos.TipoRacaoPet;

@Named
@RequestScoped
public class ProdutoBean {
	private Produto produto = new Produto();
	private List<Long> secoesPetId = new ArrayList<>();
	private Long tipoProdutoPetId = 0L;
	private List<Long> tiposPetId = new ArrayList<>();
	private List<Long> tiposRacaoPetId = new ArrayList<>();



	@Inject
	private ProdutoDao produtoDao;
	@Inject
	private SecaoPetDao secaoPetDao;
	@Inject
	private TipoProdutoPetDao tipoProdutoPetDao;
	@Inject
	private TipoPetDao tipoPetDao;
	@Inject
	private TipoRacaoPetDao tipoRacaoPetDao;
	@Inject
	private NecessitaPreRenderizacaoDeDao necessitaPreRenderizacaoDeDao;

//	// Ajax
//	private Renderizado renderizado = new Renderizado();
	
	// Persistencia
	@Transactional
	public void salvar() {
		for (Long secaoId : secoesPetId) {
			produto.getSecoesPet().add(new SecaoPet(secaoId));
		}
		produto.setTipoProdutoPet(new TipoProdutoPet(tipoProdutoPetId));
		for (Long tipoPetId : tiposPetId) {
			produto.getTiposPet().add(new TipoPet(tipoPetId));
		}
		for (Long tipoRacaoPetId : tiposRacaoPetId) {
			produto.getTiposRacaoPet().add(new TipoRacaoPet(tipoRacaoPetId));
		}
		produtoDao.adiciona(produto);
		this.produto = new Produto();
		this.secoesPetId = new ArrayList<>();
		this.tipoProdutoPetId = 0L;
		this.tiposPetId = new ArrayList<>();
		this.tiposRacaoPetId = new ArrayList<>();

	}
	// Getters and Setters

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Long> getSecoesPetId() {
		return secoesPetId;
	}

	public void setSecoesPetId(List<Long> secoesPetId) {
		this.secoesPetId = secoesPetId;
	}

	public Long getTipoProdutoPetId() {
		return tipoProdutoPetId;
	}

	public void setTipoProdutoPetId(Long tipoProdutoPetId) {
		this.tipoProdutoPetId = tipoProdutoPetId;
	}

	public List<Long> getTiposPetId() {
		return tiposPetId;
	}

	public void setTiposPetId(List<Long> tiposPetId) {
		this.tiposPetId = tiposPetId;
	}

	public List<Long> getTiposRacaoPetId() {
		return tiposRacaoPetId;
	}

	public void setTiposRacaoPetId(List<Long> tiposRacaoPetId) {
		this.tiposRacaoPetId = tiposRacaoPetId;
	}

	// OUTROS
	public List<SecaoPet> getSecoesPet() {
		return secaoPetDao.listaTodos();
	}

	public List<TipoProdutoPet> getTiposProdutoPet() {
		return tipoProdutoPetDao.listaTodos();
	}

	public List<TipoPet> getTiposPet() {
		return tipoPetDao.listaTodos();
	}

	public List<TipoRacaoPet> getTiposRacaoPet() {
		return tipoRacaoPetDao.listaTodos();
	}
	// Ajax
	public boolean getTipoRacaoRenderizado() {
		System.out.println("tipoProdutoPetId: " + tipoProdutoPetId);
//		System.out.println("tipoProdutoPet: " + tipoProdutoPetDao.buscaPorId(new Long(tipoProdutoPetId)));
//		return renderizado.getTipoRacaoRenderizado(tipoProdutoPetId, tipoProdutoPetDao, necessitaPreRenderizacaoDeDao);
		if(tipoProdutoPetId == 0) {
			return false;
		}
		NecessitaPreRenderizacaoDe necessitaPreRenderizacaoDe = necessitaPreRenderizacaoDeDao.buscaPorId(tipoProdutoPetId);
		System.out.println(necessitaPreRenderizacaoDe);
		return necessitaPreRenderizacaoDe.getTipoRacaoPet();
	}
}