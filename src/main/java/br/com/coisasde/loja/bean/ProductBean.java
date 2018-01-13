package br.com.coisasde.loja.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.coisasde.loja.daos.novos.ProductDao;
import br.com.coisasde.loja.daos.novos.SectionDao;
import br.com.coisasde.loja.model.produto.Product;
import br.com.coisasde.loja.model.produto.Section;

@Named
@RequestScoped
public class ProductBean {
	private Product product = new Product();
	private List<Integer> sectionsId = new ArrayList<>();

	@Inject
	private ProductDao productDao;
	@Inject
	private SectionDao sectionDao;
	
	@Transactional
	public void save() {
		for(Integer sectionId : sectionsId) {
			product.getSections().add(new Section(sectionId));
		}
		productDao.adiciona(product);
		this.product = new Product();
		this.sectionsId = new ArrayList<>();

	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Section> getSections() {
		System.out.println("ENTROU AQUI 0 - getSections");
		return sectionDao.listaTodos();
	}

	public List<Integer> getSectionsId() {
		System.out.println("ENTROU AQUI 1 - getSectionsId");
		return sectionsId;
	}

	public void setSectionsId(List<Integer> sectionsId) {
		System.out.println("ENTROU AQUI 2 - setSectionsId");
		this.sectionsId = sectionsId;
	}








}