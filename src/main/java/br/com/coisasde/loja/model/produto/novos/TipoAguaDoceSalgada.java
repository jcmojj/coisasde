package br.com.coisasde.loja.model.produto.novos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TipoAguaDoceSalgada {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToOne(mappedBy = "tipoAguaDoceSalgada")
	private EspeciePeixe especiePeixe;

	@Override
	public String toString() {
		return "TipoAguaDoceSalgada [id=" + id + ", nome=" + nome + ", especiePeixe=" + especiePeixe + "]";
	}

	// Constructor
	public TipoAguaDoceSalgada() {
	}

	public TipoAguaDoceSalgada(Long id) {
		super();
		this.id = id;
	}

	// Getter and Setter
	public TipoAguaDoceSalgada(String nome) {
		super();
		this.nome = nome;
	}

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

	public EspeciePeixe getEspeciePeixe() {
		return especiePeixe;
	}

	public void setEspeciePeixe(EspeciePeixe especiePeixe) {
		this.especiePeixe = especiePeixe;
	}

}