package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.Marca;

@Stateless
public class MarcaDao extends Dao<Marca> {

	public MarcaDao() {
		super(Marca.class);
	}
}