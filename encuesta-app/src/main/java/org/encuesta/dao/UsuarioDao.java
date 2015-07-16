package org.encuesta.dao;

import java.util.List;

import org.encuesta.domain.Usuario;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public interface UsuarioDao {
	
	public void saveUsuario(Usuario usuario);
	boolean editUsuario(Usuario usuario);
	Usuario findUsuario(String username,String pwd);
	public void setNombre(String username);
	public List<Usuario> getlista();
	public List<Usuario> getlistaEncontrados();
	
}
/*public void deleteUsuario(String username);
public Usuario getUser(String username);*/
//public void insertUser(String username, String name, String password, boolean enabled);