package br.com.coisasde.loja.model.produto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tete {
@Id
private Integer id;
		public String testinho;
		public String textao;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getTestinho() {
			return testinho;
		}
		public void setTestinho(String testinho) {
			this.testinho = testinho;
		}
		public String getTextao() {
			return textao;
		}
		public void setTextao(String textao) {
			this.textao = textao;
		}
		
}
