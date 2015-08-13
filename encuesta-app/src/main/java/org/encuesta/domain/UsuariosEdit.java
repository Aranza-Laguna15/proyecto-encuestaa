package org.encuesta.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_editados")
public class UsuariosEdit {
	@Id
	@Column(name = "id_edicion")
	private Integer id_edicion;
	
	@Column(name="username_ant")
	private String username_ant;
	
	@Column(name="username_new")
	private String username_new;
	
	@Column(name="name_ant")
	private String name_ant;
	
	@Column(name="name_new")
	private String name_new;
	
	@Column(name="password_ant")
	private String password_ant;
	
	@Column(name="password_new")
	private String password_new;
	
	@Column(name="enabled_ant")
	private boolean enabled_ant;
	
	@Column(name="enabled_new")
	private boolean enabled_new;
	
	@Column(name="fecha_edicion")
	private String fecha_edicion;

	

	public Integer getId_edicion() {
		return id_edicion;
	}

	public void setId_edicion(Integer id_edicion) {
		this.id_edicion = id_edicion;
	}

	public String getUsername_ant() {
		return username_ant;
	}

	public void setUsername_ant(String username_ant) {
		this.username_ant = username_ant;
	}

	public String getUsername_new() {
		return username_new;
	}

	public void setUsername_new(String username_new) {
		this.username_new = username_new;
	}

	public String getName_ant() {
		return name_ant;
	}

	public void setName_ant(String name_ant) {
		this.name_ant = name_ant;
	}

	public String getName_new() {
		return name_new;
	}

	public void setName_new(String name_new) {
		this.name_new = name_new;
	}

	public String getPassword_ant() {
		return password_ant;
	}

	public void setPassword_ant(String password_ant) {
		this.password_ant = password_ant;
	}

	public String getPassword_new() {
		return password_new;
	}

	public void setPassword_new(String password_new) {
		this.password_new = password_new;
	}

	public boolean isEnabled_ant() {
		return enabled_ant;
	}

	public void setEnabled_ant(boolean enabled_ant) {
		this.enabled_ant = enabled_ant;
	}

	public boolean isEnabled_new() {
		return enabled_new;
	}

	public void setEnabled_new(boolean enabled_new) {
		this.enabled_new = enabled_new;
	}

	public String getFecha_edicion() {
		return fecha_edicion;
	}

	public void setFecha_edicion(String fecha_edicion) {
		this.fecha_edicion = fecha_edicion;
	}

	@Override
	public String toString() {
		return "Usuarios_Delete [ id_edicion=" + id_edicion +", username_ant=" + username_ant + ",  username_new=" + username_new + ", name_ant=" + name_ant
				+ ",name_new=" + name_new+ ", password_ant=" + password_ant + ",  password_new=" + password_new + ",enabled_ant=" + enabled_ant+ ", "
						+ "enabled_new=" + enabled_new+ ", fecha_edicion="+ fecha_edicion+"]";
	}
	
}
