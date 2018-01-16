package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.EspecieMamifero;

@Stateless
public class EspecieMamiferoDao extends Dao<EspecieMamifero> {

	public EspecieMamiferoDao() {
		super(EspecieMamifero.class);
	}
}