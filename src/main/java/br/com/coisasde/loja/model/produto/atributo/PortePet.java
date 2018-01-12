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
public class PortePet implements Serializable{
	private static final long serialVersionUID = 1L;

	@OneToOne(mappedBy = "portePet")
	private CachorroAlimentacaoSeca cachorroAlimentacaoSeca;
	@OneToOne(mappedBy = "portePet")
	private CachorroAlimentacaoPetisco cachorroAlimentacaoPetisco;
//	@OneToOne(mappedBy = "portePet")
//	private GatoAlimentacaoSeca gatoAlimentacaoSeca;
//	@OneToOne(mappedBy = "portePet")
//	private GatoAlimentacaoPetisco gatoAlimentacaoPetisco;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(unique=true)
	private String porte;
	
	@Override
	public String toString() {
		return "PortePet [id=" + id + ", porte=" + porte + "]";
	}

	public CachorroAlimentacaoSeca getCachorroAlimentacaoSeca() {
		return cachorroAlimentacaoSeca;
	}

	public void setCachorroAlimentacaoSeca(CachorroAlimentacaoSeca cachorroAlimentacaoSeca) {
		this.cachorroAlimentacaoSeca = cachorroAlimentacaoSeca;
	}

//	public GatoAlimentacaoSeca getGatoAlimentacaoSeca() {
//		return gatoAlimentacaoSeca;
//	}
//
//	public void setGatoAlimentacaoSeca(GatoAlimentacaoSeca gatoAlimentacaoSeca) {
//		this.gatoAlimentacaoSeca = gatoAlimentacaoSeca;
//	}
//
//	public GatoAlimentacaoPetisco getGatoAlimentacaoPetisco() {
//		return gatoAlimentacaoPetisco;
//	}
//
//	public void setGatoAlimentacaoPetisco(GatoAlimentacaoPetisco gatoAlimentacaoPetisco) {
//		this.gatoAlimentacaoPetisco = gatoAlimentacaoPetisco;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}


}