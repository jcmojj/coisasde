package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.EspeciePassaro;

@Stateless
public class EspeciePassaroDao extends Dao<EspeciePassaro> {

	public EspeciePassaroDao() {
		super(EspeciePassaro.class);
	}
}