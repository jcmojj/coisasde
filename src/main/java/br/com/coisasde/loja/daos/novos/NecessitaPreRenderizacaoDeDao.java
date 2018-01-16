package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.NecessitaPreRenderizacaoDe;

@Stateless
public class NecessitaPreRenderizacaoDeDao extends Dao<NecessitaPreRenderizacaoDe> {

	public NecessitaPreRenderizacaoDeDao() {
		super(NecessitaPreRenderizacaoDe.class);
	}
}
