package org.encuesta.service;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.encuesta.dao.UsuarioDao;
import org.encuesta.domain.Usuario;
import org.encuesta.domain.Usuario_Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;  
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("loginService")
public class LoginService implements UserDetailsService{

	@Autowired
	UsuarioDao usuariodao;

	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		Usuario user = usuariodao.finbyUsername(username);
		System.out.println("USUARIO FIND: "+user);
		List<GrantedAuthority> authorities = buildUserAuthority(user
				.getUserRole());
		System.out.println("AUTHORITIES: "+authorities);
		return buildUserForAuthentication(user, authorities);
	}

	private User buildUserForAuthentication(Usuario user,
			List<GrantedAuthority> authorities) {
		return new User(user.getUsername(), user.getPassword(),
				user.isEnabled(), true, true, true, authorities);
	}

	private List<GrantedAuthority> buildUserAuthority(Set<Usuario_Role> userRoles) {

		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

		// Build user's authorities
		for (Usuario_Role userRole : userRoles) {
			setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
		}

		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(
				setAuths);

		return Result;
	}
	
}
