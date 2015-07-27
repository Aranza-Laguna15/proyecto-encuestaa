package org.encuesta.dao;

import java.util.List;

import org.encuesta.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioDao {
	
	public Usuario saveUsuario(Usuario user);
	public void editUsuario(Usuario usuario);
	public void deleteUser(String username);
	Usuario findUsuario(String username,String pwd);
	public void setNombre(String username);
	public List<Usuario> getlista();
	public List<Usuario> getlistaEncontrados();
	
}
/*public void deleteUsuario(String username);
public Usuario getUser(String username);*/
//public void insertUser(String username, String name, String password, boolean enabled);