package org.encuesta.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="users", catalog="encuesta")
public class Usuario {
	@Id
	@Column(name="username")
	@NotEmpty(message="Ingrese el nombre de usuario")
	private String username;
	
	@Column(name="name")
	@NotEmpty(message="Ingrese el nombre del usuario")
	private String name;
	
	@Column(name="password")
	@NotEmpty(message="Ingrese la clave del usuario")
	private String password;
	
	@Column(name="enabled")
	private boolean enabled; 
	
	 @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")  
	private Set<Usuario_Role> userRole = new HashSet<Usuario_Role>(0);
	

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Usuario_Role> getUserRole() {
		return userRole;
	}
	public void setUserRole(Set<Usuario_Role> userRole) {
		this.userRole = userRole;
	}
	
	@Override
	public String toString() {
		return "Usuario [username=" + username + ", name=" + name
				+ ", password=" + password + ", enabled=" + enabled + "]";
	}
	
	
}
