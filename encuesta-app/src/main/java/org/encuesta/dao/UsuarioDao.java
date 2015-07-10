package org.encuesta.dao;

import java.util.List;

import org.encuesta.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioDao {
	boolean saveUsuario(Usuario usuario);
	boolean editUsuario(Usuario usuario);
	Usuario findUsuario(String username,String pwd);
	
	public void insertUser(String username, String name, String password, boolean enabled);
	public void setNombre(String username);
	public List<Usuario> getlista();
	public List<Usuario> getlistaEncontrados();
	
}
