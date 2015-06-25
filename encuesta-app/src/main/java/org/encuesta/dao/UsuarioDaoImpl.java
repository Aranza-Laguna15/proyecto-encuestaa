package org.encuesta.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.encuesta.domain.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value="usuarioDao")
public class UsuarioDaoImpl implements UsuarioDao{
public List<Usuario> result;
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
		List<Usuario> resultr= (List<Usuario>) em.createQuery("SELECT us FROM Usuario us WHERE us.username=:user AND us.password=:pwd AND us.enabled=true ")
			.setParameter("user", username)
			.setParameter("pwd", pwd).getSingleResult();
		 return (Usuario) resultr;
		}catch(Exception ex){}
		return null;
	}
	
	@Transactional(readOnly=true)
	@SuppressWarnings("unchecked")
	public List<Usuario> getlista() {
		System.out.println("hola 1");
		
		List<Usuario> resulta=em.createQuery("select user from Usuario user").getResultList(); 
		System.out.println("hola 0: " + resulta);
		return resulta;
	}

	@SuppressWarnings("unchecked")
	public void setNombre(String username) {
		try{
			result= (List<Usuario>) em.createQuery("SELECT us FROM Usuario us WHERE us.username=:user")
				.setParameter("user", username).getResultList();
			System.out.println("byUser: " + result);
			
			}catch(Exception ex){}
	}
	public List<Usuario> getlistaEncontrados() {
		return result;
	}



}
