package br.com.coisasde.loja.model.produto;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.com.coisasde.loja.model.produto.atributo.IdadePet;
import br.com.coisasde.loja.model.produto.atributo.Marca;
import br.com.coisasde.loja.model.produto.atributo.PesoRacao;
import br.com.coisasde.loja.model.produto.atributo.PortePet;
import br.com.coisasde.loja.model.produto.atributo.RacaCachorro;
import br.com.coisasde.loja.model.produto.atributo.TipoRacao;

@Entity
public class CachorroAlimentacaoSeca extends ProdutoMaster{
	private static final long serialVersionUID = 1L;

	
	public CachorroAlimentacaoSeca() {
		super();
		setTipoPet("Cachorro");
		setSecaoPet("Alimentação");
		setTipoProdutoPet("Seca");
	}
	
	@OneToOne
	private Marca marca;
	@OneToOne
	private TipoRacao tipoRacao;
	@OneToOne
	private PesoRacao pesoRacao;
	@OneToOne
	private IdadePet idadePet;
	@OneToOne
	private PortePet portePet;
	@OneToOne
	private RacaCachorro racaCachorro;


	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public TipoRacao getTipoRacao() {
		return tipoRacao;
	}
	public void setTipoRacao(TipoRacao tipoRacao) {
		this.tipoRacao = tipoRacao;
	}
	public PesoRacao getPesoRacao() {
		return pesoRacao;
	}
	public void setPesoRacao(PesoRacao pesoRacao) {
		this.pesoRacao = pesoRacao;
	}
	public IdadePet getIdadePet() {
		return idadePet;
	}
	public void setIdadePet(IdadePet idadePet) {
		this.idadePet = idadePet;
	}
	public PortePet getPortePet() {
		return portePet;
	}
	public void setPortePet(PortePet portePet) {
		this.portePet = portePet;
	}
	public RacaCachorro getRacaCachorro() {
		return racaCachorro;
	}
	public void setRacaCachorro(RacaCachorro racaCachorro) {
		this.racaCachorro = racaCachorro;
	}

	
	


	
}