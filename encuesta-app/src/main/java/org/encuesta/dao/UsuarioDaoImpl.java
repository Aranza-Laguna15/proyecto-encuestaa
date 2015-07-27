package org.encuesta.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.encuesta.domain.Usuario;
import org.encuesta.dao.UsuarioDao;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UsuarioDaoImpl implements UsuarioDao{
public List<Usuario> result,fechas;
	
@PersistenceContext
private EntityManager em;
private ShaPasswordEncoder encoder;

public void setEm(EntityManager em) {
	this.em=em;
	}  	
//u.setPassword(encoder.encodePassword("123456", u.getUsername()));
@Transactional
	public Usuario saveUsuario(Usuario user) {
	try{
		String pass=user.getPassword();
		System.out.println("PASS: "+pass);
		user.setEnabled(true);
		//user.setPassword(encoder.encodePassword(pass, user.getUsername()));
		//System.out.println("PASSWORD: "+ user.getPassword());
		System.out.println("Usuario "+user);
			em.persist(user);
			em.flush();
			System.out.println("AGREGADO 1 "+ user);
			return user;
			
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("ERROR "+ex.getLocalizedMessage());
	}
	return null;
}

	public void editUsuario(Usuario usuario) {
		try{
			Usuario user=(Usuario)em.find(Usuario.class, usuario);
			user.setEnabled(true);
			em.merge(user);
			System.out.println("Usuario Editado "+ user);
		}catch(Exception ex){}
	}
	
	public void deleteUser(String username) {
		try{
		Usuario user=(Usuario)em.find(Usuario.class, username);
		System.out.println("User: "+user);
		if(user!= null){
			em.remove(user);
			System.out.println("USUARIO ELIMINADO "+user);
		}
		}catch(Exception err){
		System.out.print("Error Eliminado" + err);
		}
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

