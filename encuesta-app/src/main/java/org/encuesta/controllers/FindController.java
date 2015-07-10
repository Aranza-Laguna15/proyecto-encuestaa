package org.encuesta.controllers;

import org.encuesta.service.EncuestaService;
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
	public EncuestaService eS;
	
	@RequestMapping(value = "/findbyDateUser.htm",method = RequestMethod.GET)
	  public String singleRequestDateUser(){
		 return "findbyDateUser";
	   }
	
	@RequestMapping(value="/findbyDateUser.htm", method = RequestMethod.POST)
	 public String findUserbyDateUser(Model model,@RequestParam(value = "d1",required = true)String d1, @RequestParam(value="d2", required = true)String d2, @RequestParam(value="username", required = true) String username){
		eS.setFechUser(d1, d2, username);
		
		if(eS.getFechUser()==null){
		System.out.println("ERROR *-* NO ENCONTRADO");
		model.addAttribute("ERROR", "NO SE ENCONTRARON ENCUESTAS");
		return null;
		}else{
			System.out.println("DE: "+d1+" HASTA: "+d2+" USERNAME: "+username);
			model.addAttribute("ef",eS.getFechUser());
		}
		return "findbyDateUserR";
	 }
	@RequestMapping(value = "/findbyDateLoc.htm",method = RequestMethod.GET)
	  public String DateLoc(){
		 return "findbyDateLoc";
	   }
	
	@RequestMapping(value="/findbyDateLoc.htm", method = RequestMethod.POST)
	 public String findDatesLoc(Model model,@RequestParam(value = "fec1",required = true)String fec1, @RequestParam(value="fec2", required = true) String fec2){
		eS.setFecha(fec1, fec2);
		if(eS.getbydate()==null){
		System.out.println("ERROR *-* NO ENCONTRADO");
		model.addAttribute("ERROR", "NO SE ENCONTRARON ENCUESTAS");
		return null;
	}else{
			System.out.println("DE: "+fec1+" HASTA: "+fec2);
			model.addAttribute("ef",eS.getbydate());
		}
		return "findbyDateLocR";
	 }
	@RequestMapping(value = "/findbyUserLoc.htm",method = RequestMethod.GET)
	  public String userLoc(){
		 return "findbyUserLoc";
	   }
	
	@RequestMapping(value="/findbyUserLoc.htm", method = RequestMethod.POST)
	 public String finduUerLoc(Model model,@RequestParam(value = "user",required = true)String user){
		eS.setUser(user);
		if(eS.getUsers()==null){
		System.out.println("ERROR *-* NO ENCONTRADO");
		model.addAttribute("ERROR", "NO SE ENCONTRARON ENCUESTAS");
		return null;
	}else{
			model.addAttribute("user",eS.getUsers());
			System.out.println("USERS LOC"+eS.getUsers() );
		}
		return "findbyUserLocR";
	 }
}

