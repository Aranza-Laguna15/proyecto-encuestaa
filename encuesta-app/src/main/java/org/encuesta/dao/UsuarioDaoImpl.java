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
private ShaPasswordEncoder encoder=new ShaPasswordEncoder(256);

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
		user.setPassword(encoder.encodePassword(pass, user.getUsername()));
		System.out.println("PASSWORD: "+ user.getPassword());
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

	public Usuario editUsuario(Usuario usuario) {
		try{
			//Usuario user=(Usuario)em.find(Usuario.class, username);
			String pass=usuario.getPassword();
			usuario.setPassword(encoder.encodePassword(pass, usuario.getUsername()));
			usuario.setEnabled(true);
			System.out.println("Usuario E: "+usuario);
			em.merge(usuario);
			System.out.println("Usuario Editado "+ usuario);
			return usuario;
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("ERROR EDIT "+ex.getLocalizedMessage());
		}
		
		return null;
	}
	
	public void deleteUser(String username) {
		try{
			Usuario usuario=(Usuario)em.find(Usuario.class, username);
		usuario.setEnabled(false);
		em.persist(usuario);
		System.out.println("USUARIO: " +usuario);
		
		if(usuario!= null && usuario.isEnabled()==false){
			Usuario user=(Usuario)em.find(Usuario.class, username);
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
	
	public Usuario finbyUsername(String username) {
		Usuario user=(Usuario)em.find(Usuario.class, username);
		return user;
	}

	
}

