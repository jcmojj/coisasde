package br.com.coisasde.loja.model.produto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TipoProdutoPet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;

	@OneToOne(mappedBy="tipoProdutoPet")
	private Produto produto;

	@Override
	public String toString() {
		return "TipoProdutoPet [id=" + id + ", nome=" + nome + ", produto=" + produto + "]";
	}
	// Construtor
	public TipoProdutoPet(Integer id) {
		super();
		this.id = id;
	}
	
	public TipoProdutoPet(String nome) {
		super();
		this.nome = nome;
	}
	
	public TipoProdutoPet() {
		super();
	}
	
	//Getters and Setters
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

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
