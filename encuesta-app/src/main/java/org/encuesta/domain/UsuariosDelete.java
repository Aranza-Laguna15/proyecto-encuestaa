package org.encuesta.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_eliminados")
public class UsuariosDelete {
	@Id
	@Column(name = "id_eliminado")
	private Integer id_eliminado;
	
	@Column(name="username")
	private String username;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@Column(name="fecha_eliminacion")
	private String fecha_eliminacion;
	
	@Column(name="eliminado_por")
	private String eliminado_por;
	
	public Integer getId_eliminado() {
		return id_eliminado;
	}
	public void setId_eliminado(Integer id_eliminado) {
		this.id_eliminado = id_eliminado;
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

	public String getFecha_eliminacion() {
		return fecha_eliminacion;
	}

	public void setFecha_eliminacion(String fecha_eliminacion) {
		this.fecha_eliminacion = fecha_eliminacion;
	}

	public String getEliminado_por() {
		return eliminado_por;
	}

	public void setEliminado_por(String eliminado_por) {
		this.eliminado_por = eliminado_por;
	}

	@Override
	public String toString() {
		return "Usuarios_Delete [ id_eliminado=" + id_eliminado +", username=" + username + ", name=" + name
				+ ", password=" + password + ", enabled=" + enabled+ ", fecha_eliminacion="+ fecha_eliminacion+",eliminado_por="+eliminado_por+"]";
	}
	
}
