package br.com.coisasde.loja.daos.produto.atributo;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.atributo.TipoRacao;

@Stateless
public class TipoRacaoDao extends Dao<TipoRacao> {

	public TipoRacaoDao() {
		super(TipoRacao.class);
	}
}
