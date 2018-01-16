package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.TipoAguaDoceSalgada;

@Stateless
public class TipoAguaDoceSalgadaDao extends Dao<TipoAguaDoceSalgada> {

	public TipoAguaDoceSalgadaDao() {
		super(TipoAguaDoceSalgada.class);
	}
}
