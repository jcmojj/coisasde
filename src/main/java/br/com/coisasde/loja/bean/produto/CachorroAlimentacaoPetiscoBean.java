package br.com.coisasde.loja.bean.produto;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.coisasde.loja.daos.ProdutoDao;
import br.com.coisasde.loja.model.produto.CachorroAlimentacaoPetisco;

@Named
@RequestScoped
public class CachorroAlimentacaoPetiscoBean {
	private CachorroAlimentacaoPetisco cachorroAlimentacaoPetisco = new CachorroAlimentacaoPetisco();
	
	@Inject
	private ProdutoDao dao;
	
	@Transactional
	public void salvar() {
		dao.adiciona(cachorroAlimentacaoPetisco);
		System.out.println("Produto salvo com sucesso" + cachorroAlimentacaoPetisco);
	}

	public CachorroAlimentacaoPetisco getCachorroAlimentacaoPetisco() {
		return cachorroAlimentacaoPetisco;
	}

	public void setCachorroAlimentacaoPetisco(CachorroAlimentacaoPetisco cachorroAlimentacaoPetisco) {
		this.cachorroAlimentacaoPetisco = cachorroAlimentacaoPetisco;
	}
	
}