package br.com.coisasde.loja.bean.inicializar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import br.com.coisasde.loja.daos.LogradouroDao;
import br.com.coisasde.loja.daos.PaesciDao;
import br.com.coisasde.loja.daos.TipoTelefoneDao;
import br.com.coisasde.loja.daos.novos.EspeciePeixeDao;
import br.com.coisasde.loja.daos.novos.IdadePetDao;
import br.com.coisasde.loja.daos.novos.NecessitaPreRenderizacaoDeDao;
import br.com.coisasde.loja.daos.novos.PortePetDao;
import br.com.coisasde.loja.daos.novos.SecaoPetDao;
import br.com.coisasde.loja.daos.novos.TipoAbertoFechadoDao;
import br.com.coisasde.loja.daos.novos.TipoNovoUsadoDao;
import br.com.coisasde.loja.daos.novos.TipoPetDao;
import br.com.coisasde.loja.daos.novos.TipoProdutoPetDao;
import br.com.coisasde.loja.daos.novos.TipoRacaoPetDao;
import br.com.coisasde.loja.model.produto.novos.IdadePet;
import br.com.coisasde.loja.model.produto.novos.NecessitaPreRenderizacaoDe;
import br.com.coisasde.loja.model.produto.novos.PortePet;
import br.com.coisasde.loja.model.produto.novos.SecaoPet;
import br.com.coisasde.loja.model.produto.novos.TipoAbertoFechado;
import br.com.coisasde.loja.model.produto.novos.TipoNovoUsado;
import br.com.coisasde.loja.model.produto.novos.TipoPet;
import br.com.coisasde.loja.model.produto.novos.TipoProdutoPet;
import br.com.coisasde.loja.model.produto.novos.TipoRacaoPet;
import br.com.coisasde.loja.model.usuario.endereco.Logradouro;
import br.com.coisasde.loja.model.usuario.endereco.Paesci;
import br.com.coisasde.loja.model.usuario.telefone.TipoTelefone;

@Named
@RequestScoped
public class InicializarBean {

	@Transactional
	public void todos() {
		logradouro();
		tipoTelefone();
		paesci();
		secao();
		tipoProdutoPet();
		tipoPet();
		tipoRacaoPet();
		tipoNovoUsado();
		tipoAbertoFechado();
		portePet();
		idadePet();
	}

	@Inject
	private LogradouroDao logradouroDao;

	@Transactional
	public void logradouro() {
		try {
			InputStream is = new FileInputStream(
					"/Users/josecarlosoliveira/javaee/eclipse-workspace/coisasde/target/classes/br/com/coisasde/loja/model/usuario/endereco/logradouro");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String logradouro = br.readLine();

			while (logradouro != null) {

				logradouroDao.adiciona(new Logradouro(logradouro));

				logradouro = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Inject
	private TipoTelefoneDao tipoTelefoneDao;

	@Transactional
	public void tipoTelefone() {
		try {
			InputStream is = new FileInputStream(
					"/Users/josecarlosoliveira/javaee/eclipse-workspace/coisasde/target/classes/br/com/coisasde/loja/model/usuario/telefone/tipoTelefone");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String tipoTelefone = br.readLine();

			while (tipoTelefone != null) {

				tipoTelefoneDao.adiciona(new TipoTelefone(tipoTelefone));

				tipoTelefone = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Inject
	private PaesciDao paesciDao;

	@Transactional
	public void paesci() {
		System.out.println("Entrou tb");
		try {
			InputStream is = new FileInputStream(
					"/Users/josecarlosoliveira/javaee/eclipse-workspace/coisasde/target/classes/br/com/coisasde/loja/model/usuario/endereco/paesci");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			Integer first;
			Integer second;
			Integer third;
			Integer lenght;
			String pais;
			String estado;
			String cidade;

			while (s != null) {
				first = 0;
				second = s.indexOf("-", first);
				third = s.indexOf("-", second + 1);
				lenght = s.length();
				pais = s.substring(first, second);
				estado = s.substring(second + 1, third);
				cidade = s.substring(third + 1, lenght);
				paesciDao.adiciona(new Paesci(pais, estado, cidade));
				s = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Inject
	private SecaoPetDao secaoPetDao;

	@Transactional
	public void secao() {
		try {
			InputStream is = new FileInputStream(
					"/Users/josecarlosoliveira/javaee/eclipse-workspace/coisasde/target/classes/br/com/coisasde/loja/model/produto/novos/secaoPet");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String secao = br.readLine();

			while (secao != null) {

				secaoPetDao.adiciona(new SecaoPet(secao));

				secao = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// @Inject
	// private TipoProdutoPetDao tipoProdutoPetDao;
	//
	// @Transactional
	// public void tipoProdutoPet() {
	// try {
	// InputStream is = new FileInputStream(
	// "/Users/josecarlosoliveira/javaee/eclipse-workspace/coisasde/target/classes/br/com/coisasde/loja/model/produto/novos/tipoProdutoPet");
	// InputStreamReader isr = new InputStreamReader(is);
	// BufferedReader br = new BufferedReader(isr);
	// String tipoProdutoPet = br.readLine();
	//
	// while (tipoProdutoPet != null) {
	//
	// tipoProdutoPetDao.adiciona(new TipoProdutoPet(tipoProdutoPet));
	//
	// tipoProdutoPet = br.readLine();
	// }
	// br.close();
	// } catch (FileNotFoundException e) {
	// e.printStackTrace();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	@Inject
	private TipoProdutoPetDao tipoProdutoPetDao;
	@Inject
	private NecessitaPreRenderizacaoDeDao necessitaPreRenderizacaoDeDao;

	@Transactional
	public void tipoProdutoPet() {
		System.out.println("entrou aqui!");
		try {
			InputStream is = new FileInputStream(
					"/Users/josecarlosoliveira/javaee/eclipse-workspace/coisasde/target/classes/br/com/coisasde/loja/model/produto/novos/tipoProdutoPet");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String linha = br.readLine();
			linha = br.readLine();

			String tipoProdutoPetName;
			Boolean tipoPet = false;
			Boolean secaoPet = false;
			Boolean tipoRacao = false;

			Integer posicaoInicial;
			Integer posicaoFinal;

			while (linha != null) {
				posicaoInicial = 0;
				posicaoFinal = linha.indexOf(";", posicaoInicial);
				tipoProdutoPetName = linha.substring(0, posicaoFinal);
				posicaoInicial = posicaoFinal + 1;

				tipoPet = necessario(linha, posicaoInicial);
				posicaoFinal = posicaoFinal(linha, posicaoInicial);
				posicaoInicial = posicaoFinal + 1;

				secaoPet = necessario(linha, posicaoInicial);
				posicaoFinal = posicaoFinal(linha, posicaoInicial);
				posicaoInicial = posicaoFinal + 1;

				tipoRacao = necessario(linha, posicaoInicial);
				posicaoFinal = posicaoFinal(linha, posicaoInicial);
				TipoProdutoPet tipoProdutoPet = new TipoProdutoPet(tipoProdutoPetName);
				tipoProdutoPet = tipoProdutoPetDao.adicionaVolta(tipoProdutoPet);
				NecessitaPreRenderizacaoDe necessitaPreRenderizacaoDe = new NecessitaPreRenderizacaoDe(tipoProdutoPet,
						tipoPet, secaoPet, tipoRacao);
				necessitaPreRenderizacaoDeDao.adiciona(necessitaPreRenderizacaoDe);

				linha = br.readLine();
				System.out.println("ACABOU WHILE");
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//
	private Integer posicaoFinal(String linha, Integer posicaoInicial) {
		Integer posicaoFinal;
		Integer posicaoTrue = linha.indexOf("t", posicaoInicial);
		Integer posicaoFalse = linha.indexOf("f", posicaoInicial);
		System.out.println("1PosicaoTrue: " + posicaoTrue + " PosicaoFalse: " + posicaoFalse);
		if ((posicaoTrue < posicaoFalse && posicaoTrue != -1) || posicaoFalse == -1) {
			posicaoFinal = posicaoTrue + 1;
		} else {
			posicaoFinal = posicaoFalse + 1;
		}
		return posicaoFinal;
	}

	private Boolean necessario(String linha, Integer posicaoInicial) {
		Boolean variavel = false;
		Integer posicaoTrue = linha.indexOf("t", posicaoInicial);
		Integer posicaoFalse = linha.indexOf("f", posicaoInicial);
		if ((posicaoTrue < posicaoFalse && posicaoTrue != -1) || posicaoFalse == -1) {
			variavel = true;
		} else {
			variavel = false;
		}
		return variavel;
	}

	@Inject
	private TipoPetDao tipoPetDao;

	@Transactional
	public void tipoPet() {
		try {
			InputStream is = new FileInputStream(
					"/Users/josecarlosoliveira/javaee/eclipse-workspace/coisasde/target/classes/br/com/coisasde/loja/model/produto/novos/tipoPet");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String tipoPet = br.readLine();

			while (tipoPet != null) {

				tipoPetDao.adiciona(new TipoPet(tipoPet));

				tipoPet = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Inject
	private TipoRacaoPetDao tipoRacaoPetDao;

	@Transactional
	public void tipoRacaoPet() {
		try {
			InputStream is = new FileInputStream(
					"/Users/josecarlosoliveira/javaee/eclipse-workspace/coisasde/target/classes/br/com/coisasde/loja/model/produto/novos/tipoRacaoPet");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String tipoRacaoPet = br.readLine();

			while (tipoRacaoPet != null) {

				tipoRacaoPetDao.adiciona(new TipoRacaoPet(tipoRacaoPet));

				tipoRacaoPet = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Inject
	private TipoNovoUsadoDao tipoNovoUsadoDao;

	@Transactional
	public void tipoNovoUsado() {
		tipoNovoUsadoDao.adiciona(new TipoNovoUsado("Novo"));
		tipoNovoUsadoDao.adiciona(new TipoNovoUsado("Usado"));
	}

	@Inject
	private TipoAbertoFechadoDao tipoAbertoFechadoDao;

	@Transactional
	public void tipoAbertoFechado() {
		tipoAbertoFechadoDao.adiciona(new TipoAbertoFechado("Aberto"));
		tipoAbertoFechadoDao.adiciona(new TipoAbertoFechado("Fechado"));
	}

	@Inject
	private IdadePetDao idadePetDao;

	@Transactional
	public void idadePet() {
		try {
			InputStream is = new FileInputStream(
					"/Users/josecarlosoliveira/javaee/eclipse-workspace/coisasde/target/classes/br/com/coisasde/loja/model/produto/novos/idadePet");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String idadePet = br.readLine();

			while (idadePet != null) {

				idadePetDao.adiciona(new IdadePet(idadePet));

				idadePet = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Inject
	private PortePetDao portePetDao;

	@Transactional
	public void portePet() {
		try {
			InputStream is = new FileInputStream(
					"/Users/josecarlosoliveira/javaee/eclipse-workspace/coisasde/target/classes/br/com/coisasde/loja/model/produto/novos/portePet");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String portePet = br.readLine();

			while (portePet != null) {

				portePetDao.adiciona(new PortePet(portePet));

				portePet = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Inject
	private EspeciePeixeDao especiePeixeDao;

	public void especiePeixe()  {

		
	}

}
