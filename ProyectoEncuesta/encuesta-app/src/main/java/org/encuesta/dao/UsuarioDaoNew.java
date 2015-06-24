package org.encuesta.dao;

import java.util.List;

import org.encuesta.domain.Usuario;
import org.encuesta.domain.UsuariosNew;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioDaoNew {
	Usuario findUsuario(String username,String pwd);
	Usuario findUsuario(String username);
	public List<UsuariosNew> getlistaNuevos();
}
