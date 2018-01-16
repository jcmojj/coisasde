package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.TipoNovoUsado;

@Stateless
public class TipoNovoUsadoDao extends Dao<TipoNovoUsado> {

	public TipoNovoUsadoDao() {
		super(TipoNovoUsado.class);
	}
}
