package org.encuesta.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_nuevos")
public class UsuariosNew {
	@Id
	@Column(name="id_historial")
	private String id_historial;
	
	@Column(name="username")
	private String username;
	
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@Column(name="fecha_insercion")
	private String fecha_insercion;
	
	public String getId_historial() {
		return id_historial;
	}

	public void setId_historial(String id_historial) {
		this.id_historial = id_historial;
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

	public String getFecha_insercion() {
		return fecha_insercion;
	}

	public void setFecha_insercion(String fecha_insercion) {
		this.fecha_insercion = fecha_insercion;
	}


	@Override
	public String toString() {
		return "Usuario [id_historial=" + id_historial + ",username=" + username + ", name=" + name
				+ ", password=" + password + ", enabled=" + enabled + ", fecha_insercion=" + fecha_insercion + "]";
	}
	
}
