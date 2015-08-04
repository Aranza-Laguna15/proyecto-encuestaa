package org.encuesta.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_roles", catalog="encuesta")
public class Usuario_Role {
	@Id
	@Column(name="user_role_id")
	private Integer user_role_id;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn(name = "username")  
	private Usuario user;
	
	@Column(name="role")
	private String role;
	
	public Integer getUser_role_id() {
		return user_role_id;
	}
	public void setUser_role_id(Integer user_role_id) {
		this.user_role_id = user_role_id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	
}
