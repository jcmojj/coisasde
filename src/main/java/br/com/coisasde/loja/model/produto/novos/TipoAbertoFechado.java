package br.com.coisasde.loja.model.produto.novos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.coisasde.loja.model.produto.Produto;

@Entity
public class TipoAbertoFechado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToOne(mappedBy = "tipoAbertoFechado")
	private Produto produto;

	@Override
	public String toString() {
		return "TipoAbertoFechado [id=" + id + ", nome=" + nome + ", produto=" + produto + "]";
	}

	// Constructor
	public TipoAbertoFechado() {
	}

	public TipoAbertoFechado(Long id) {
		super();
		this.id = id;
	}

	public TipoAbertoFechado(String nome) {
		super();
		this.nome = nome;
	}

	// Getter and Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}