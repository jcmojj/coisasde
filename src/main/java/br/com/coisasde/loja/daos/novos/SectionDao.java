package br.com.coisasde.loja.daos.novos;

import javax.ejb.Stateless;

import br.com.coisasde.loja.daos.Dao;
import br.com.coisasde.loja.model.produto.Section;

@Stateless
public class SectionDao extends Dao<Section> {

	public SectionDao() {
		super(Section.class);
	}
}
