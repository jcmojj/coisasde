package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.EspecieRoedor;

@Stateless
public class EspecieRoedorDao extends Dao<EspecieRoedor> {

	public EspecieRoedorDao() {
		super(EspecieRoedor.class);
	}
}