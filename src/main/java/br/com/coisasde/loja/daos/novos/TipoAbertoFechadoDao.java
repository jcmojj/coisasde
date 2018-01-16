package br.com.coisasde.loja.daos.novos;


import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.TipoAbertoFechado;

@Stateless
public class TipoAbertoFechadoDao extends Dao<TipoAbertoFechado> {

	public TipoAbertoFechadoDao() {
		super(TipoAbertoFechado.class);
	}
}