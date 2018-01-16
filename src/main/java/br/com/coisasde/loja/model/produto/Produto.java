package br.com.coisasde.loja.model.produto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import br.com.coisasde.loja.model.produto.novos.SecaoPet;
import br.com.coisasde.loja.model.produto.novos.TipoPet;
import br.com.coisasde.loja.model.produto.novos.TipoProdutoPet;
import br.com.coisasde.loja.model.produto.novos.TipoRacaoPet;

@Entity
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	@Lob
	private String descricao;
	private BigDecimal preco;
	private Integer quantidade;
	@ManyToMany
	private List<SecaoPet> secoesPet = new ArrayList<>();
	@OneToOne
	private TipoProdutoPet tipoProdutoPet;
	@ManyToMany
	private List<TipoPet> tiposPet = new ArrayList<>();
	@ManyToMany
	private List<TipoRacaoPet> tiposRacaoPet = new ArrayList<>();

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco
				+ ", quantidade=" + quantidade + ", secoesPet=" + secoesPet + ", tipoProdutoPet=" + tipoProdutoPet
				+ ", tiposPet=" + tiposPet + ", tiposRacaoPet=" + tiposRacaoPet + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public List<SecaoPet> getSecoesPet() {
		return secoesPet;
	}

	public void setSecoesPet(List<SecaoPet> secoesPet) {
		this.secoesPet = secoesPet;
	}

	public TipoProdutoPet getTipoProdutoPet() {
		return tipoProdutoPet;
	}

	public void setTipoProdutoPet(TipoProdutoPet tipoProdutoPet) {
		this.tipoProdutoPet = tipoProdutoPet;
	}

	public List<TipoPet> getTiposPet() {
		return tiposPet;
	}

	public void setTiposPet(List<TipoPet> tiposPet) {
		this.tiposPet = tiposPet;
	}

	public List<TipoRacaoPet> getTiposRacaoPet() {
		return tiposRacaoPet;
	}

	public void setTiposRacaoPet(List<TipoRacaoPet> tiposRacaoPet) {
		this.tiposRacaoPet = tiposRacaoPet;
	}

}