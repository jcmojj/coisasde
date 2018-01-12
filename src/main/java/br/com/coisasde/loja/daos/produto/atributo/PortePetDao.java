package br.com.coisasde.loja.daos.produto.atributo;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.atributo.PortePet;

@Stateless
public class PortePetDao extends Dao<PortePet> {

	public PortePetDao() {
		super(PortePet.class);
	}
}
