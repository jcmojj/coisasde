package br.com.coisasde.loja.daos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.model.produto.novos.TipoProduto;

@Stateless
public class TipoProdutoDao extends Dao<TipoProduto> {

	public TipoProdutoDao() {
		super(TipoProduto.class);
	}
}
