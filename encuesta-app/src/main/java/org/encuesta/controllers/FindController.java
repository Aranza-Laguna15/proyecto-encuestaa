package org.encuesta.controllers;

import org.encuesta.dao.UsuarioDao;
import org.encuesta.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	 @RequestMapping(value = "/findbyUser.htm",method = RequestMethod.GET)
	  public String singleRequest(){
		 return "findbyUser";
	   }
	
	@RequestMapping(value="/findbyUser.htm", method = RequestMethod.POST)
	 public String findUserbyUsername(Model model,@RequestParam(value = "user",required = true)String user){
		System.out.println("username : "+user);
		uS.setUsuarioNombre(user);
		System.out.println("usuario encontrado: " + uS.getListaEncontrado());
		model.addAttribute("user",uS.getListaEncontrado());
		return "findbyUserRe";
	 }
	
}

