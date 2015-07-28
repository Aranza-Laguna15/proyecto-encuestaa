package org.encuesta.service;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.encuesta.dao.UsuarioDao;
import org.encuesta.dao.UsuarioDaoDel;
import org.encuesta.dao.UsuarioDaoEdit;
import org.encuesta.dao.UsuarioDaoNew;
import org.encuesta.domain.Usuario;
import org.encuesta.domain.Usuario_Role;
import org.encuesta.domain.UsuariosDelete;
import org.encuesta.domain.UsuariosEdit;
import org.encuesta.domain.UsuariosNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;  
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UsuarioService implements UserDetailsService{
	
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
	/*
	 * LOGIN
	 */
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(final String username)
			throws UsernameNotFoundException {
		Usuario usuario =usuarioDao.finbyUsername(username);
		List<GrantedAuthority> authorities = 
				buildUserAuthority(usuario.getUserRole());
		return buildUserForAuthentication(usuario, authorities);
	}
	
	private User buildUserForAuthentication(Usuario usuario, List<GrantedAuthority> authorities){
		return new User(usuario.getUsername(),usuario.getPassword(),usuario.isEnabled(), true,true,true,authorities);
	}
	
	private List<GrantedAuthority> buildUserAuthority(Set<Usuario_Role> Usuario_Roles){
		Set<GrantedAuthority> setAuths= new HashSet<GrantedAuthority>();
		for(Usuario_Role userRole: Usuario_Roles){
		setAuths.add(new SimpleGrantedAuthority(userRole.getRole())); 
		}
		 List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);  
		 return Result; 
	}
	
}
