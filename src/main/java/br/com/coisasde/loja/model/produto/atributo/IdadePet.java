package br.com.coisasde.loja.model.produto.atributo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.coisasde.loja.model.produto.CachorroAlimentacaoPetisco;
import br.com.coisasde.loja.model.produto.CachorroAlimentacaoSeca;
import br.com.coisasde.loja.model.produto.GatoAlimentacaoPetisco;
import br.com.coisasde.loja.model.produto.GatoAlimentacaoSeca;

@Entity
public class IdadePet implements Serializable{
	private static final long serialVersionUID = 1L;

	
	@OneToOne(mappedBy = "idadePet")
	private CachorroAlimentacaoSeca cachorroAlimentacaoSeca;
	@OneToOne(mappedBy = "idadePet")
	private CachorroAlimentacaoPetisco cachorroAlimentacaoPetisco;
	@OneToOne(mappedBy = "idadePet")
	private GatoAlimentacaoSeca gatoAlimentacaoSeca;
	@OneToOne(mappedBy = "idadePet")
	private GatoAlimentacaoPetisco gatoAlimentacaoPetisco;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(unique=true)
	private String idade;
	
	@Override
	public String toString() {
		return "IdadePet [id=" + id + ", idade=" + idade + "]";
	}

	public CachorroAlimentacaoSeca getCachorroAlimentacaoSeca() {
		return cachorroAlimentacaoSeca;
	}

	public void setCachorroAlimentacaoSeca(CachorroAlimentacaoSeca cachorroAlimentacaoSeca) {
		this.cachorroAlimentacaoSeca = cachorroAlimentacaoSeca;
	}

	public CachorroAlimentacaoPetisco getCachorroAlimentacaoPetisco() {
		return cachorroAlimentacaoPetisco;
	}

	public void setCachorroAlimentacaoPetisco(CachorroAlimentacaoPetisco cachorroAlimentacaoPetisco) {
		this.cachorroAlimentacaoPetisco = cachorroAlimentacaoPetisco;
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

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}



}