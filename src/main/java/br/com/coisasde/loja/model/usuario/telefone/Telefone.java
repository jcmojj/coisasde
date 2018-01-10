package br.com.coisasde.loja.model.usuario.telefone;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.coisasde.loja.model.usuario.Pessoa;

@Entity
public class Telefone implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer ddd;
	private Long numero;
	@ManyToOne
	private Pessoa pessoa;
	@ManyToOne
	private TipoTelefone tipo;
	
	public Telefone() {
		super();
	}
	
	public Telefone(Integer ddd, Long numero, TipoTelefone tipo) {
		super();
		this.setDdd(ddd);
		this.numero = numero;
		this.tipo = tipo;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}
	
	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	

	
	
	
}
