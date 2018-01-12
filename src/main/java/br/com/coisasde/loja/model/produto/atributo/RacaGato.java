package br.com.coisasde.loja.model.produto.atributo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.coisasde.loja.model.produto.GatoAlimentacaoPetisco;
import br.com.coisasde.loja.model.produto.GatoAlimentacaoSeca;

@Entity
public class RacaGato implements Serializable{
	private static final long serialVersionUID = 1L;

	@OneToOne(mappedBy = "racaGato")
	private GatoAlimentacaoSeca gatoAlimentacaoSeca;
	@OneToOne(mappedBy = "racaGato")
	private GatoAlimentacaoPetisco gatoAlimentacaoPetisco;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(unique=true)
	private String nome;
	
	@Override
	public String toString() {
		return "RacaPet [id=" + id + ", nome=" + nome + "]";
	}

	public GatoAlimentacaoSeca getGatoAlimentacaoSeca() {
		return gatoAlimentacaoSeca;
	}

	public void setGatoAlimentacaoSeca(GatoAlimentacaoSeca gatoAlimentacaoSeca) {
		this.gatoAlimentacaoSeca = gatoAlimentacaoSeca;
	}

	public GatoAlimentacaoPetisco getGatoAlimentacaoPetisco() {
		return gatoAlimentacaoPetisco;
	}

	public void setGatoAlimentacaoPetisco(GatoAlimentacaoPetisco gatoAlimentacaoPetisco) {
		this.gatoAlimentacaoPetisco = gatoAlimentacaoPetisco;
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


}
