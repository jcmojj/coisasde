package br.com.coisasde.loja.model.produto.novos;

import br.com.coisasde.loja.daos.novos.NecessitaPreRenderizacaoDeDao;
import br.com.coisasde.loja.daos.novos.TipoProdutoPetDao;

public class Renderizado {
	
//	public boolean getTiposPetRenderizado(List<Integer> tiposPetId) {
//		boolean renderizar = true;
//		return renderizar;
//	}
	
	public boolean getTipoRacaoRenderizado(Long tipoProdutoPetId, TipoProdutoPetDao tipoProdutoPetDao, NecessitaPreRenderizacaoDeDao necessitaPreRenderizacaoDeDao) {
		NecessitaPreRenderizacaoDe necessitaPreRenderizacaoDe = necessitaPreRenderizacaoDeDao.buscaPorId(tipoProdutoPetId);
//		necessitaPreRenderizacaoDe.
		
//		boolean renderizar = false;
//		if(tipoProdutoPetId != 0L && tipoProdutoPetId != null) {
//			TipoProdutoPet tipoProdutoPet = tipoProdutoPetDao.buscaPorId(new Long(tipoProdutoPetId));
//			System.out.println("tipoProdutoPet: " + tipoProdutoPetDao.buscaPorId(new Long(tipoProdutoPetId)));
//			switch(tipoProdutoPet.getNome()) {
//			case "Ração Seca": renderizar = true;
//			case "Ração em Latas e Saches": renderizar = true;
//			case "Ossinho": renderizar = true;
//			case "Petisco": renderizar = true;
//			}	
//		}
		return necessitaPreRenderizacaoDe.getTipoRacao();
	}

}
