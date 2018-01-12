package br.com.coisasde.loja.daos.produto;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.GatoAlimentacaoSeca;

@Stateless
public class GatoAlimentacaoSecaDao extends Dao<GatoAlimentacaoSeca> {

	public GatoAlimentacaoSecaDao() {
		super(GatoAlimentacaoSeca.class);
	}
}