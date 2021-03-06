package org.encuesta.dao;

import java.util.Date;
import java.util.List;

import org.encuesta.domain.Encuesta;
import org.springframework.stereotype.Component;

@Component
public interface EncuestaDao {
	boolean saveEncuesta(Encuesta encuesta);
	boolean editEncuesta(Encuesta encuesta);
	List<Encuesta> findEncuestas(Date d1,Date d2);
	List<Encuesta> findEncuestas(Date d1,Date d2,String username);
	Encuesta findEncuesta(int idEncuesta);
	
	public void setFechas(String fech1, String fech2);
	public List<Encuesta> getbydate();
	
	public void setFechUser(String d1, String d2, String username);
	public List<Encuesta>getFechUser();
	
	public void setUser(String username);
	public List<Encuesta>getUsers();
	

}
