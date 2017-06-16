package org.chenche.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
	
	public List<SigningLog> findByUser(String user){
		EntityManager em = EMF.get().createEntityManager();
		try{
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<SigningLog> criteria = cb.createQuery(SigningLog.class);
			Root<SigningLog> root = criteria.from(SigningLog.class);
			criteria.select(root).where(cb.equal(root.get("user"),user));
			TypedQuery<SigningLog> q = em.createQuery(criteria);
			return q.getResultList();
		}
		finally {
			em.close();
		}
	}
}
