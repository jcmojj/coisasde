
package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.novos.EspeciePeixe;

@Stateless
public class EspeciePeixeDao extends Dao<EspeciePeixe> {

	public EspeciePeixeDao() {
		super(EspeciePeixe.class);
	}
}