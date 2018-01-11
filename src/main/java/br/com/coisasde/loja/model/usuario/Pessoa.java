package br.com.coisasde.loja.model.usuario;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.coisasde.loja.model.usuario.endereco.Endereco;
import br.com.coisasde.loja.model.usuario.telefone.Telefone;

@Entity
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cpf;
	private String rg;
	@OneToMany
	private List<Telefone> telefones;
	@OneToOne(mappedBy = "pessoa", cascade = CascadeType.ALL) //ok
	private Usuario usuario;
	@OneToOne(cascade = CascadeType.ALL) //ok
	private Endereco endereco;

	public Pessoa() {
		super();
	}

//	public Pessoa(String nome, String cpf, String rg, List<Telefone> telefones, Usuario usuario, Endereco endereco) {
//		super();
//		this.nome = nome;
//		this.cpf = cpf;
//		this.rg = rg;
//		this.telefones = telefones;
//		this.usuario = usuario;
//		this.endereco = endereco;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Usuario getusuario() {
		return usuario;
	}

	public void setusuario(Usuario usuario) {
		this.usuario = usuario;
		usuario.recebePessoa(this);
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
		endereco.recebePessoa(this);
	}

	public void recebeEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void recebeUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}