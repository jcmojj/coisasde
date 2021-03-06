package br.com.coisasde.loja.model.produto.novos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import br.com.coisasde.loja.model.produto.Produto;

@Entity
public class EspeciePeixe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@ManyToMany
	private List<Produto> produtos;
	@OneToOne
	private TipoAguaDoceSalgada tipoAguaDoceSalgada;



	@Override
	public String toString() {
		return "EspeciePeixe [id=" + id + ", nome=" + nome + ", produtos=" + produtos + ", tipoAguaDoceSalgada="
				+ tipoAguaDoceSalgada + "]";
	}

	// Constructor
	public EspeciePeixe() {
		super();
	}

	public EspeciePeixe(Long id) {
		super();
		this.id = id;
	}

	public EspeciePeixe(String nome) {
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

	public TipoAguaDoceSalgada getTipoAguaDoceSalgada() {
		return tipoAguaDoceSalgada;
	}

	public void setTipoAguaDoceSalgada(TipoAguaDoceSalgada tipoAguaDoceSalgada) {
		this.tipoAguaDoceSalgada = tipoAguaDoceSalgada;
	}
	

}