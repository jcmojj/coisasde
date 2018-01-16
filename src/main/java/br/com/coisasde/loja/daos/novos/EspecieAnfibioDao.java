package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.EspecieAnfibio;

@Stateless
public class EspecieAnfibioDao extends Dao<EspecieAnfibio> {

	public EspecieAnfibioDao() {
		super(EspecieAnfibio.class);
	}
}