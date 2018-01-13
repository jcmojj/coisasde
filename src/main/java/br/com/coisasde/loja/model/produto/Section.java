package br.com.coisasde.loja.model.produto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Section {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	@ManyToMany
	private List<Product> products;
	

// Construtores
	public Section() {
	}
	public Section(Integer sectionId) {
		this.id = sectionId;
	}
	public Section (String name) {
		this.name = name;
	}
	public Section(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public List<Product> getProducts() {
//		return products;
//	}
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}
	@Override
	public String toString() {
		return "Section [id=" + id + ", name=" + name + "]";
	}

}
