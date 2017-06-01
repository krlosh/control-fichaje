package org.chenche.service;

import javax.persistence.EntityManager;

import org.chenche.model.SigningLog;

public class SigningService {

	
	public void save(SigningLog data){
		EntityManager em = EMF.get().createEntityManager();
		try{
			em.persist(data);
		}
		finally {
			em.close();
		}
		
	}
}
