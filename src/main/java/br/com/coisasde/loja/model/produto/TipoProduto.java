package br.com.coisasde.loja.model.produto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (uniqueConstraints= {@UniqueConstraint(columnNames = {"tipoPrincipal","tipos","subTipos"})})
public class TipoProduto {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String tipoPrincipal;
	private String tipos;
	private String subTipos;
	
	public TipoProduto(String tipoPrincipal, String tipos, String subTipos) {
		super();
		this.tipoPrincipal = tipoPrincipal;
		this.tipos = tipos;
		this.subTipos = subTipos;
	}



	@Override
	public String toString() {
		return "TipoProduto [id=" + id + ", tipoPrincipal=" + tipoPrincipal + ", tipos=" + tipos + ", subTipos="
				+ subTipos + "]";
	}



	public String getTipoPrincipal() {
		return tipoPrincipal;
	}

	public void setTipoPrincipal(String tipoPrincipal) {
		this.tipoPrincipal = tipoPrincipal;
	}

	public String getTipos() {
		return tipos;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}

	public String getSubTipos() {
		return subTipos;
	}

	public void setSubTipos(String subTipos) {
		this.subTipos = subTipos;
	}
	
	
	
	
}
