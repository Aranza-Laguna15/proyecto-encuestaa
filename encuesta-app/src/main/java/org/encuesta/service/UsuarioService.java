package org.encuesta.service;


import java.util.List;
import org.encuesta.dao.UsuarioDao;
import org.encuesta.dao.UsuarioDaoDel;
import org.encuesta.dao.UsuarioDaoEdit;
import org.encuesta.dao.UsuarioDaoNew;
import org.encuesta.domain.Usuario;
import org.encuesta.domain.UsuariosDelete;
import org.encuesta.domain.UsuariosEdit;
import org.encuesta.domain.UsuariosNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UsuarioService {
	
	@Autowired
	public UsuarioDaoDel usuarioDaoDel;
	@Autowired
	public UsuarioDao usuarioDao;
	@Autowired
	public UsuarioDaoEdit usuarioDaoEdit;
	@Autowired
	public UsuarioDaoNew usuarioDaoNew;
	
	@Transactional
	public void setUsuario(UsuarioDao usuarioDao ){
		this.usuarioDao=usuarioDao;
	}
	@Transactional
	public List<Usuario> getUsuario(){
		return usuarioDao.getlista();
	}
	/*
	 * GET DELETE USERS 
	 */
	@Transactional
	public void setUsuariosDelete(UsuarioDaoDel usuarioDaoDel ){
		this.usuarioDaoDel=usuarioDaoDel;
	}
	@Transactional
	public List<UsuariosDelete> getUsuariosDelete(){
		return usuarioDaoDel.getlistaEliminados();
	}
	/*
	 * GET EDIT USERS
	 */
	@Transactional
	public void setUsuariosEdit(UsuarioDaoEdit usuarioDaoEdit ){
		this.usuarioDaoEdit=usuarioDaoEdit;
	}
	@Transactional
	public List<UsuariosEdit> getUsuariosEdit(){
		return usuarioDaoEdit.getlistaEditados();
	}
	
	/*
	 * GET NEW USERS 
	 */
	@Transactional
	public void setUsuariosNew(UsuarioDaoNew usuarioDaoNew ){
		this.usuarioDaoNew=usuarioDaoNew;
	}
	@Transactional
	public List<UsuariosNew> getUsuariosNew(){
		return usuarioDaoNew.getlistaNuevos();
	}

	/*
	 * GET ALL USERS
	 */
	@Transactional
	public void setUsuarioNombre(String username){
		this.usuarioDao.setNombre(username);
	}
	@Transactional
	public List<Usuario> getListaEncontrado() {
		return usuarioDao.getlistaEncontrados();
		
	}
/*
 * ADD USER
 */
	@Transactional
	public void addUser(Usuario usuario){
		usuarioDao.saveUsuario(usuario);
	}
	/*
	 * DELETE USER
	 */
	@Transactional
	public void deleteUser(String username){
		usuarioDao.deleteUser(username);
	}
	/*
	 *UPDATE USER 
	 */
	@Transactional
	public void updateUser(Usuario usuario){
		usuarioDao.editUsuario(usuario);
	}
	
}
