package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.RacaGato;

@Stateless
public class RacaGatoDao extends Dao<RacaGato> {

	public RacaGatoDao() {
		super(RacaGato.class);
	}
}