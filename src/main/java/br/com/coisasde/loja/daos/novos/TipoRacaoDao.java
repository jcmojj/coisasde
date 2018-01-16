package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.TipoRacao;

@Stateless
public class TipoRacaoDao extends Dao<TipoRacao> {

	public TipoRacaoDao() {
		super(TipoRacao.class);
	}
}
