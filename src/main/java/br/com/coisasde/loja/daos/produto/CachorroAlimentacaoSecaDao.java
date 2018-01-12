package br.com.coisasde.loja.daos.produto;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.CachorroAlimentacaoSeca;

@Stateless
public class CachorroAlimentacaoSecaDao extends Dao<CachorroAlimentacaoSeca> {

	public CachorroAlimentacaoSecaDao() {
		super(CachorroAlimentacaoSeca.class);
	}
}
