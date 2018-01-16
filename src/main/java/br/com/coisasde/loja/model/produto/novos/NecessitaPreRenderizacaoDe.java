package br.com.coisasde.loja.model.produto.novos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class NecessitaPreRenderizacaoDe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
//	@Column(unique = true)
	private TipoProdutoPet tipoProdutoPet;

	private Boolean tipoPet;
	private Boolean secaoPet;
	private Boolean tipoRacaoPet;

	@Override
	public String toString() {
		return "NecessitaPreRenderizacaoDe [id=" + id + ", tipoPet=" + tipoPet
				+ ", secaoPet=" + secaoPet + ", tipoRacaoPet=" + tipoRacaoPet + "]";
	}

	public NecessitaPreRenderizacaoDe() {
		super();
	}
	
	
	public NecessitaPreRenderizacaoDe(Long id) {
		super();
		this.id = id;
	}

	public NecessitaPreRenderizacaoDe(TipoProdutoPet tipoProdutoPet, Boolean tipoPet, Boolean secaoPet, Boolean tipoRacaoPet) {
		super();
		this.tipoProdutoPet = tipoProdutoPet;
		this.tipoPet = tipoPet;
		this.secaoPet = secaoPet;
		this.tipoRacaoPet = tipoRacaoPet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoProdutoPet getTipoProdutoPet() {
		return tipoProdutoPet;
	}

	public void setTipoProdutoPet(TipoProdutoPet tipoProdutoPet) {
		this.tipoProdutoPet = tipoProdutoPet;
	}

	public Boolean getTipoPet() {
		return tipoPet;
	}

	public void setTipoPet(Boolean tipoPet) {
		this.tipoPet = tipoPet;
	}

	public Boolean getSecaoPet() {
		return secaoPet;
	}

	public void setSecaoPet(Boolean secaoPet) {
		this.secaoPet = secaoPet;
	}

	public Boolean getTipoRacaoPet() {
		return tipoRacaoPet;
	}

	public void setTipoRacaoPet(Boolean tipoRacaoPet) {
		this.tipoRacaoPet = tipoRacaoPet;
	}
	
//	public Boolean getTipoRacaoPetRenderizado(Long tipoProdutoPetId, TipoProdutoPetDao tipoProdutoPetDao, NecessitaPreRenderizacaoDeDao necessitaPreRenderizacaoDeDao) {
//		
//		return true;
//	}


}