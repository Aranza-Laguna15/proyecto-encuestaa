package org.encuesta.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.encuesta.dao.EncuestaDao;
import org.encuesta.dao.UsuarioDao;
import org.encuesta.domain.Encuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@WebService
public class EncuestaService {
	
	@Autowired
	private ShaPasswordEncoder encoder;
	@Autowired
	private EncuestaDao encuestaDao;
	
/*	@WebMethod(operationName="loginapplication")
	public String loginApplication(@WebParam(name="xmlRequest")String xmlRequest){
		try{
			String usuario = getNodo(xmlRequest, "user");
			String pwd = getNodo(xmlRequest, "pwd");
			if(usuarioDao.findUsuario(usuario,encoder.encodePassword(pwd, usuario))!=null)
				return "<code>11</code>";
		}catch(Exception ex){}
		return "<code>00</code><msg>Error de acceso</msg>";
	}
	
	@WebMethod(operationName="saveQuiz")
	public String guardarEncuesta(@WebParam(name="xmlRequest")String xmlRequest){
		StringBuffer xmlResponse=new StringBuffer("<code>00</code><msg>Error al procesar la solicitud</msg>");
		try{
			String usuario = getNodo(xmlRequest, "user");
			String pwd = getNodo(xmlRequest, "pwd");
			if(usuarioDao.findUsuario(usuario,encoder.encodePassword(pwd, usuario))!=null){
				Encuesta e = new Encuesta();
				e.setCmpActual(getNodo(xmlRequest, "cmpActual"));
				e.setComiActual(Double.parseDouble(getNodo(xmlRequest, "comiActual")));
				e.setDireccion(getNodo(xmlRequest, "direccion"));
				e.setFecha(new Date());
				e.setGiroNegocio(getNodo(xmlRequest, "giroNegocio"));
				e.setLatitud(Double.parseDouble(getNodo(xmlRequest, "latitud")));
				e.setLongitud(Double.parseDouble(getNodo(xmlRequest, "longitud")));
				e.setNombre(getNodo(xmlRequest, "nombre"));
				e.setNombreNegocio(getNodo(xmlRequest, "nombreNegocio"));
				e.setTelefono(getNodo(xmlRequest, "telefono"));
				e.setUsername(usuario);
				if(encuestaDao.saveEncuesta(e)){
					xmlResponse=new StringBuffer("<code>11</code><msg>Encuesta guardada exitosamente!!</msg>");
				}else{
					xmlResponse=new StringBuffer("<code>00</code><msg>Error al guardar la encuesta, intente nuevamente</msg>");
				}
			}else{
				xmlResponse=new StringBuffer("<code>00</code><msg>Error de acceso al sistema, intente nuevamente</msg>");
			}
		}catch(Exception ex){
			xmlResponse=new StringBuffer("<code>00</code><msg>Error en servicio, intente nuevamente</msg>");
		}
		return xmlResponse.toString();
	}
	
	@WebMethod(exclude=true)
	private String getNodo(String xml,String node){
		try{
			StringBuilder builder = new StringBuilder(xml);
	   	     int indexOffBegin = builder.indexOf("<" + node + ">") + node.length() + 2;
	   	     int indexOffEnd = builder.indexOf("</" + node + ">");
	   	     return (builder.substring(indexOffBegin, indexOffEnd));
		}catch(Exception ex){}
		return "";
	}*/

	@Transactional
	public void setFechas(String fech1, String fech2){
		this.encuestaDao.setFechas(fech1, fech2);
	}
	
	public List<Encuesta> getbydate() {
		return encuestaDao.getbydate();
	}

	@Transactional
	public void setFechUser(String d1, String d2, String username){
	this.encuestaDao.setFechUser(d1, d2, username);
	}

	public List<Encuesta> getFechUser() {
	return encuestaDao.getFechUser();
	}
	@Transactional
	public void setFecha(String fec1, String fec2){
		this.encuestaDao.setFechas(fec1, fec2);
	}
	@Transactional
	public void setUser(String username){
		this.encuestaDao.setUser(username);
	}
	public List<Encuesta> getUsers(){
		return encuestaDao.getUsers();
	}
}
