package br.com.fiap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
	
	public static EntityManager criarConexao() {
		return emf.createEntityManager();
	}

}
