package br.com.coisasde.loja.model.produto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table (uniqueConstraints= {@UniqueConstraint(columnNames = {"tipoPet","secaoPet","tipoProdutoPet"})})
public abstract class Produto implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	@Lob
	private String descricao;
	private BigDecimal preco;
	private Integer quantidade;
	
//	 @Column
	protected String tipoPet;
//	 @Column
	protected String secaoPet;
//	 @Column
	protected String tipoProdutoPet;

	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", quantidade=" + quantidade
				+ "]";
	}
	
	

	public Produto() {
		super();
	}



	protected String getTipoPet() {
		return tipoPet;
	}


	protected void setTipoPet(String tipoPet) {
		this.tipoPet = tipoPet;
	}


	protected String getSecaoPet() {
		return secaoPet;
	}


	protected void setSecaoPet(String secaoPet) {
		this.secaoPet = secaoPet;
	}


	protected String getTipoProdutoPet() {
		return tipoProdutoPet;
	}


	protected void setTipoProdutoPet(String tipoProdutoPet) {
		this.tipoProdutoPet = tipoProdutoPet;
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

}