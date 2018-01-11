package br.com.coisasde.loja.model.transacao.entrega;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.coisasde.loja.model.usuario.endereco.Endereco;

@Entity
public class Entrega implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Endereco endereco;
	
	private TipoEntrega tipoEntrega;
}
