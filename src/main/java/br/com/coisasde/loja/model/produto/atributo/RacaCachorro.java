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

@Entity
public class RacaCachorro implements Serializable{
	private static final long serialVersionUID = 1L;

	@OneToOne(mappedBy = "racaCachorro")
	private CachorroAlimentacaoSeca cachorroAlimentacaoSeca;
	@OneToOne(mappedBy = "racaCachorro")
	private CachorroAlimentacaoPetisco cachorroAlimentacaoPetisco;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(unique=true)
	private String nome;
	
	@Override
	public String toString() {
		return "RacaPet [id=" + id + ", nome=" + nome + "]";
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
