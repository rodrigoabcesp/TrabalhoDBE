package br.com.fiap.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.model.Menu;

public class MenuDao {

	public void save(Menu menu) {
		
		EntityManagerFactory factory = 
					Persistence.createEntityManagerFactory("ProgamerTrabalho-persistence-unit");
		
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(menu);
		manager.getTransaction().commit();
		
		manager.clear();
	}

}
