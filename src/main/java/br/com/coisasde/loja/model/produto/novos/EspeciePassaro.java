package br.com.coisasde.loja.model.produto.novos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import br.com.coisasde.loja.model.produto.Produto;

@Entity
public class EspeciePassaro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@ManyToMany
	private List<Produto> produtos;

	@Override
	public String toString() {
		return "EspeciePassaro [id=" + id + ", nome=" + nome + ", produtos=" + produtos + "]";
	}

	// Constructor
	public EspeciePassaro() {
		super();
	}

	public EspeciePassaro(Long id) {
		super();
		this.id = id;
	}

	public EspeciePassaro(String nome) {
		super();
		this.nome = nome;
	}
	// Getters and Setters

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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}