package br.com.coisasde.loja.daos.produto.atributo;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.atributo.PesoRacao;

@Stateless
public class PesoRacaoDao extends Dao<PesoRacao> {

	public PesoRacaoDao() {
		super(PesoRacao.class);
	}
}