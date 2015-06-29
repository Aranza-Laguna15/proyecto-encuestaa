package org.encuesta.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.encuesta.domain.Encuesta;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value="encuestaDao")
public class EncuestaDaoImpl implements EncuestaDao{
	
	public List<Encuesta> fechas;
	private EntityManager em;
	
	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly=false)
	public boolean saveEncuesta(Encuesta encuesta) {
		try{
			em.persist(encuesta);
			return true;
		}catch(Exception ex){}
		return false;
	}

	@Transactional(readOnly=false)
	public boolean editEncuesta(Encuesta encuesta) {
		try{
			em.merge(encuesta);
			return true;
		}catch(Exception ex){}
		return false;
	}

	@SuppressWarnings("unchecked")
	public List<Encuesta> findEncuestas(Date d1, Date d2) {
		try{
			return em.createQuery("SELECT e FROM Encuesta e WHERE e.fecha BEWTEEN :d1 AND :d2")
			.setParameter("d1", d1)
			.setParameter("d2", d2).getResultList();
		}catch(Exception ex){}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Encuesta> findEncuestas(Date d1, Date d2, String username) {
		try{
			return em.createQuery("SELECT e FROM Encuesta e WHERE e.fecha BEWTEEN :d1 AND :d2 AND e.username=:user")
					.setParameter("d1", d1)
					.setParameter("d2", d2)
					.setParameter("user",username).getResultList();
		}catch(Exception ex){}
		return null;
	}

	public Encuesta findEncuesta(int idEncuesta) {
		try{
			return em.find(Encuesta.class, idEncuesta);
		}catch(Exception ex){}
		return null;
	}

	@SuppressWarnings("unchecked")
	public void setFechas(String fech1, String fech2) {
		
		fechas=(List<Encuesta>) em.createQuery("SELECT ef FROM Encuesta ef WHERE ef.fecha>=:fech1 AND ef.fecha<=:fech2 ")
				.setParameter("fech1", fech1)
				.setParameter("fech2", fech2).getResultList();
		System.out.println("byDate 1: " + fechas);
	}

	public List<Encuesta> getbydate() {
		System.out.println("byDate 2: " + fechas);
		return fechas;
		
	}

}
