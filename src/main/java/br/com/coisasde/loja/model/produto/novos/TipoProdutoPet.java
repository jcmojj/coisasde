package br.com.coisasde.loja.model.produto.novos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.coisasde.loja.model.produto.Produto;

@Entity
public class TipoProdutoPet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToOne(mappedBy = "tipoProdutoPet")
	private NecessitaPreRenderizacaoDe necessitaPreRenderizacaoDe;

	@OneToOne(mappedBy="tipoProdutoPet")
	private Produto produto;

	@Override
	public String toString() {
		return "TipoProdutoPet [id=" + id + ", nome=" + nome + ", produto=" + produto + "]";
	}
	// Construtor
	public TipoProdutoPet(Long id) {
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
