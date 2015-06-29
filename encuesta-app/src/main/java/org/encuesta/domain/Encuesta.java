package org.encuesta.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="informacion")
public class Encuesta {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idinformacion")
	private int idinformacion;
	@Column(name="nombreNegocio")
	@NotEmpty
	private String nombreNegocio;
	@Column(name="giroNegocio")
	@NotEmpty
	private String giroNegocio;
	@Column(name="nombre")
	private String nombre;
	@Column(name="telefono")
	@Pattern(regexp="[0-9]{10}")
	private String telefono;
	@Column(name="direccion")
	private String direccion;
	@Column(name="cmpActual")
	private String cmpActual;
	@Column(name="comiActual")
	private double comiActual;
	@Column(name="lgt")
	private double lgt;
	@Column(name="lat")
	private double lat;
	@Column(name="fecha")
	@NotNull
	private String fecha;
	@Column(name="username")
	@NotEmpty
	private String username;
	
	public int getIdinformacion() {
		return idinformacion;
	}
	public void setIdinformacion(int idinformacion) {
		this.idinformacion = idinformacion;
	}
	public String getNombreNegocio() {
		return nombreNegocio;
	}
	public void setNombreNegocio(String nombreNegocio) {
		this.nombreNegocio = nombreNegocio;
	}
	public String getGiroNegocio() {
		return giroNegocio;
	}
	public void setGiroNegocio(String giroNegocio) {
		this.giroNegocio = giroNegocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCmpActual() {
		return cmpActual;
	}
	public void setCmpActual(String cmpActual) {
		this.cmpActual = cmpActual;
	}
	public double getComiActual() {
		return comiActual;
	}
	public void setComiActual(double comiActual) {
		this.comiActual = comiActual;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getLgt() {
		return lgt;
	}
	public void setLgt(double lgt) {
		this.lgt = lgt;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "Informacion [idinformacion=" + idinformacion + ", nombreNegocio=" + nombreNegocio
				+ ", giroNegocio=" + giroNegocio + ", nombre=" + nombre + ", telefono=" + telefono + ""
						+ ", direccion=" + direccion + ", cmpActual=" + cmpActual + ""
								+ ", comiActual=" + comiActual + ", lat=" + lat + ""
										+ ", lgt=" + lgt + ", username=" + username + ", fecha=" + fecha + ""
														+ "]";
	}
	
}
