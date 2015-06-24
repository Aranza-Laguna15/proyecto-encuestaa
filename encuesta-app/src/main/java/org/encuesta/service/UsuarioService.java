package org.encuesta.service;


import java.util.List;

import javax.faces.bean.ManagedBean;

import org.encuesta.dao.UsuarioDao;
import org.encuesta.dao.UsuarioDaoDel;
import org.encuesta.dao.UsuarioDaoEdit;
import org.encuesta.dao.UsuarioDaoNew;
import org.encuesta.domain.Usuario;
import org.encuesta.domain.UsuariosDelete;
import org.encuesta.domain.UsuariosEdit;
import org.encuesta.domain.UsuariosNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@ManagedBean(name="username")
@Component
public class UsuarioService {
	
	@Autowired
	public UsuarioDaoDel usuarioDaoDel;
	@Autowired
	public UsuarioDao usuarioDao;
	@Autowired
	public UsuarioDaoEdit usuarioDaoEdit;
	@Autowired
	public UsuarioDaoNew usuarioDaoNew;
	
	public void setUsuario(UsuarioDao usuarioDao ){
		this.usuarioDao=usuarioDao;
	}
	
	public List<Usuario> getUsuario(){
		return usuarioDao.getlista();
	}
	/*
	 * 
	 */
	public void setUsuariosDelete(UsuarioDaoDel usuarioDaoDel ){
		this.usuarioDaoDel=usuarioDaoDel;
	}
	
	public List<UsuariosDelete> getUsuariosDelete(){
		return usuarioDaoDel.getlistaEliminados();
	}
	/*
	 * 
	 */
	public void setUsuariosEdit(UsuarioDaoEdit usuarioDaoEdit ){
		this.usuarioDaoEdit=usuarioDaoEdit;
	}
	
	public List<UsuariosEdit> getUsuariosEdit(){
		return usuarioDaoEdit.getlistaEditados();
	}
	
	/*
	 * 
	 */
	public void setUsuariosNew(UsuarioDaoNew usuarioDaoNew ){
		this.usuarioDaoNew=usuarioDaoNew;
	}
	public List<UsuariosNew> getUsuariosNew(){
		return usuarioDaoNew.getlistaNuevos();
	}

	/*
 * 
 */
	@Transactional
	public Usuario getUsuarioNombre(String username){
		return this.usuarioDao.getNombre(username);
	}
	
	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

	
	
	
}
