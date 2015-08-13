package org.encuesta.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.encuesta.domain.Usuario;
import org.encuesta.domain.UsuariosEdit;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value="usuarioDaoEdit")
public class UsuariosEditImpl implements UsuarioDaoEdit{

	private EntityManager em;
	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

	public Usuario findUsuario(String username, String pwd) {
		try{
			return (Usuario)em.createQuery("SELECT u FROM Usuario u WHERE u.username=:user AND u.password=:pwd AND u.enabled=true ")
			.setParameter("user", username)
			.setParameter("pwd", pwd).getSingleResult();
		}catch(Exception ex){}
		return null;
	}

	public Usuario findUsuario(String username) {
		try{
			return (Usuario)em.createQuery("SELECT u FROM Usuario u WHERE u.username=:user")
			.setParameter("user", username).getSingleResult();
		}catch(Exception ex){}
		return null;
	}
	@Transactional(readOnly=true)
	@SuppressWarnings("unchecked")
	public List<UsuariosEdit> getlistaEditados() {
		
		List<UsuariosEdit> result=em.createQuery("select ed from UsuariosEdit ed").getResultList(); 
		return result;
	}

}
