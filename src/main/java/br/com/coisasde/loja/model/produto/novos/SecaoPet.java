package br.com.coisasde.loja.model.produto.novos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import br.com.coisasde.loja.model.produto.Produto;

@Entity
public class SecaoPet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@ManyToMany
	private List<Produto> produtos;
	

// Construtores
	public SecaoPet() {
	}
	public SecaoPet(Long secaoPetId) {
		this.id = secaoPetId;
	}
	public SecaoPet (String nome) {
		this.nome = nome;
	}
	//deletar esse último
	public SecaoPet(Long id, String nome) {
		this.id = id;
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


//	public List<Produto> getProdutos() {
//		return produtos;
//	}
//	public void setProdutos(List<Produto> produtos) {
//		this.produtos = produtos;
//	}
	@Override
	public String toString() {
		return "SecaoPet [id=" + id + ", nome=" + nome + "]";
	}

}
