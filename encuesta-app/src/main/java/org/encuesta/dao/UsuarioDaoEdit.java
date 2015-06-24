package org.encuesta.dao;

import java.util.List;

import org.encuesta.domain.Usuario;
import org.encuesta.domain.UsuariosEdit;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioDaoEdit {
	Usuario findUsuario(String username,String pwd);
	Usuario findUsuario(String username);
	public List<UsuariosEdit> getlistaEditados();
}
