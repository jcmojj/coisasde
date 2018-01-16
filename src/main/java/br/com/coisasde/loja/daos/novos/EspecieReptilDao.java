package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.EspecieReptil;

@Stateless
public class EspecieReptilDao extends Dao<EspecieReptil> {

	public EspecieReptilDao() {
		super(EspecieReptil.class);
	}
}