package org.encuesta.controllers;

import java.util.Date;

import org.encuesta.dao.UsuarioDao;
import org.encuesta.service.EncuestaService;
import org.encuesta.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan("org.encuesta.service")
public class FindController {
	
	@Autowired
	public UsuarioService uS;
	@Autowired
	public UsuarioDao userDao;
	@Autowired
	public EncuestaService eS;
	
	 @RequestMapping(value = "/findbyUser.htm",method = RequestMethod.GET)
	  public String singleRequest(){
		 return "findbyUser";
	   }
	
	@RequestMapping(value="/findbyUser.htm", method = RequestMethod.POST)
	 public String findUserbyUsername(Model model,@RequestParam(value = "user",required = true)String user){
	if(uS.getListaEncontrado()==null){
		System.out.println("ERROR *-* USUARIO NO ENCONTRADO");
		model.addAttribute("ERROR", "USUARIO NO ENCONTRADO");
		return null;
	}else{
			System.out.println("username : "+user);
			uS.setUsuarioNombre(user);
			System.out.println("usuario encontrado: " + uS.getListaEncontrado());
			model.addAttribute("user",uS.getListaEncontrado());
		}
		return "findbyUserRe";
	 }
	
	@RequestMapping(value = "/findbyDate.htm",method = RequestMethod.GET)
	  public String singleRequestDate(){
		 return "findbyDate";
	   }
	
	@RequestMapping(value="/findbyDate.htm", method = RequestMethod.POST,params={"fech1=true","fech2=true"})
	 public String findUserbyDates(Model model,@RequestParam(value = "fech1",required = true)Date fech1, @PathVariable(value="fech2")Date fech2){
	if(eS.getbydate()==null){
		System.out.println("ERROR *-* NO ENCONTRADO");
		model.addAttribute("ERROR", "NO SE ENCONTRARON ENCUESTAS");
		return null;
	}else{
			System.out.println("DE: "+fech1+" HASTA: "+fech2);
			eS.setFechas(fech1, fech2);
			model.addAttribute("ef",eS.getbydate());
		}
		return "findbyDateRes";
	 }
	
}

