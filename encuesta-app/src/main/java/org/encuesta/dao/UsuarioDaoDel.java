package org.encuesta.dao;

import java.util.List;

import org.encuesta.domain.Usuario;
import org.encuesta.domain.UsuariosDelete;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioDaoDel {
	Usuario findUsuario(String username,String pwd);
	Usuario findUsuario(String username);
	public List<UsuariosDelete> getlistaEliminados();
}
