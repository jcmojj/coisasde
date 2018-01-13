package br.com.coisasde.loja.model.produto.novos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import br.com.coisasde.loja.model.produto.Produto;

@Entity
public class TipoPet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;

	@ManyToMany
	private List<Produto> produtos;


	@Override
	public String toString() {
		return "TipoPet [id=" + id + ", nome=" + nome + ", produtos=" + produtos + "]";
	}

	// Construtor
	public TipoPet(Integer id) {
		super();
		this.id = id;
	}
	
	public TipoPet(String nome) {
		super();
		this.nome = nome;
	}
	
	public TipoPet() {
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

//	public List<Produto> getProdutos() {
//		return produtos;
//	}
//
//	public void setProdutos(List<Produto> produtos) {
//		this.produtos = produtos;
//	}


}