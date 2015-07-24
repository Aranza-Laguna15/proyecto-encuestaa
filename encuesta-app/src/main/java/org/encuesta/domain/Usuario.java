package org.encuesta.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.validator.constraints.NotEmpty;

@XmlRootElement
@Entity
@Table(name="users")
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
	
	public Usuario(){}
	
	public Usuario(String username,boolean enabled, String name, String password) {
		this.username = username;
		this.name = name;
		this.password = password;
		this.enabled = true;
	}
	
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
	
	@Override
	public String toString() {
		return "Usuario [username=" + username + ", name=" + name
				+ ", password=" + password + ", enabled=" + enabled + "]";
	}
	
}
