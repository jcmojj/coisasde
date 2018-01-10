package br.com.coisasde.loja.model.usuario.endereco;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import br.com.coisasde.loja.model.usuario.Pessoa;

@Entity
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String apelido;
	@ManyToOne
	private Logradouro logradouro;
	private String endereco;
	private String numero;
	private String complemento;
	private String cep;
	@ManyToOne
	private Paesci paesci;
	@OneToOne(mappedBy = "endereco", cascade = CascadeType.ALL) // ok
	private Pessoa pessoa;

	public Endereco() {
		super();
	}

	public Endereco(Logradouro logradouro, String endereco, String numero, String complemento, String cep,
			Paesci paesci, Pessoa pessoas) {
		super();
		this.logradouro = logradouro;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.paesci = paesci;
		this.pessoa = pessoas;
	}

	public Logradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Paesci getPaesci() {
		return paesci;
	}

	public void setPaesci(Paesci paesci) {
		this.paesci = paesci;
	}

	public Pessoa getPessoas() {
		return pessoa;
	}

	public void setPessoas(Pessoa pessoa) {
		this.pessoa = pessoa;
		pessoa.recebeEndereco(this);

	}

	public void recebePessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

}