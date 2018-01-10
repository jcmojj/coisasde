package br.com.coisasde.loja.bean;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.coisasde.loja.model.usuario.endereco.Paesci;

@Named
@RequestScoped
public class InicializarBean {

//	public void logradouro(EntityManager manager) {
//		try {
//			InputStream is = new FileInputStream(
//					"C:/Users/User/Desktop/workspace/petDivisionReal/src/br/com/mykidpet/modelo/dono/logradouros");
//			InputStreamReader isr = new InputStreamReader(is);
//			BufferedReader br = new BufferedReader(isr);
//			String s = br.readLine();
//
//			Logradouro logradouro;
//
//			while (s != null) {
//				logradouro = new Logradouro();
//				logradouro.setLogradouro(s);
//				manager.persist(logradouro);
//				s = br.readLine();
//				System.out.println("while - nova linha: " + s);
//			}
//			br.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public void paesci(EntityManager manager) {
//		System.out.println("Entrou tb");
//		try {
//			InputStream is = new FileInputStream(
//					"/Users/josecarlosoliveira/javaee/eclipse-workspace/coisasde/target/classes/br/com/coisasde/loja/model/usuario/endereco/paesci");
//			InputStreamReader isr = new InputStreamReader(is);
//			BufferedReader br = new BufferedReader(isr);
//			String s = br.readLine();
//			Integer first;
//			Integer second;
//			Integer third;
//			Integer lenght;
//			String pais;
//			String estado;
//			String cidade;
//			Paesci ciespa;
//
//			while (s != null) {
//				first = 0;
//				second = s.indexOf("-", first);
//				third = s.indexOf("-", second + 1);
//				lenght = s.length();
//				pais = s.substring(first, second);
//				estado = s.substring(second + 1, third);
//				cidade = s.substring(third + 1, lenght);
//				ciespa = new Paesci();
//				ciespa.setCidade(cidade);
//				ciespa.setEstado(estado);
//				ciespa.setPais(pais);
//				System.out.println(
//						"first: " + first + " - second: " + second + " - third: " + third + " - lenght: " + lenght);
//				System.out.println("cidade: " + ciespa.getCidade() + " - estado: " + ciespa.getEstado() + " - pais: "
//						+ ciespa.getPais());
//				manager.persist(ciespa);
//				s = br.readLine();
//
//				System.out.println("while - nova linha: " + s);
//
//			}
//			br.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}