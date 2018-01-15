package br.com.coisasde.loja.model.produto.novos;

import br.com.coisasde.loja.daos.novos.TipoProdutoPetDao;

public class Renderizado {
//	public boolean getTiposPetRenderizado(List<Integer> tiposPetId) {
//		boolean renderizar = true;
//		return renderizar;
//	}
	
	public boolean getTipoProdutoPet(Long tipoProdutoPetId, TipoProdutoPetDao tipoProdutoPetDao) {
		
		boolean renderizar = false;
		if(tipoProdutoPetId != 0L && tipoProdutoPetId != null) {
			TipoProdutoPet tipoProdutoPet = tipoProdutoPetDao.buscaPorId(new Long(tipoProdutoPetId));
			System.out.println("tipoProdutoPet: " + tipoProdutoPetDao.buscaPorId(new Long(tipoProdutoPetId)));
			switch(tipoProdutoPet.getNome()) {
			case "Ração Seca": renderizar = true;
			case "Ração em Latas e Saches": renderizar = true;
			case "Ossinho": renderizar = true;
			case "Petisco": renderizar = true;
			}	
		}
		return renderizar;
	}

}
