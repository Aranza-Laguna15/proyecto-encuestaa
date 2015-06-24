package org.encuesta.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.encuesta.domain.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value="usuarioDao")
public class UsuarioDaoImpl implements UsuarioDao{

	private EntityManager em;
	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional(readOnly=false)
	public boolean saveUsuario(Usuario usuario) {
		try{
			em.persist(usuario);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

	@Transactional(readOnly=false)
	public boolean editUsuario(Usuario usuario) {
		try{
			em.merge(usuario);
			return true;
		}catch(Exception ex){}
		return false;
	}

	
	 @SuppressWarnings("unchecked")
	public Usuario findUsuario(String username, String pwd) {
		try{
		List<Usuario> result= (List<Usuario>) em.createQuery("SELECT us FROM Usuario us WHERE us.username=:user AND us.password=:pwd AND us.enabled=true ")
			.setParameter("user", username)
			.setParameter("pwd", pwd).getSingleResult();
		 return (Usuario) result;
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
	public List<Usuario> getlista() {
		System.out.println("hola 1");
		
		List<Usuario> result=em.createQuery("select user from Usuario user").getResultList(); 
		System.out.println("hola: " + result);
		return result;
	}

	public Usuario getNombre(String username) {
		try{
			Usuario result= (Usuario) em.createQuery("SELECT us FROM Usuario us WHERE us.username=:user")
				.setParameter("user", username).getResultList();
			 return result;
			}catch(Exception ex){}
			return null;
	}

	public List<Usuario> getlistaEncontrados() {
		
		return null;
	}

}
