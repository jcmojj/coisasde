package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.EspecieInseto;

@Stateless
public class EspecieInsetoDao extends Dao<EspecieInseto> {

	public EspecieInsetoDao() {
		super(EspecieInseto.class);
	}
}