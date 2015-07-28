package org.encuesta.controllers;

import org.encuesta.domain.Usuario;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

	@RequestMapping("/login")
	public Model getLoginForm(@ModelAttribute Usuario usuario, @RequestParam(value="error", required=false) String error,
			@RequestParam(value="logout", required=false)String logout, Model model){
		String message="";
		if (error != null) {  
			   message = "USUARIO o CONTRASEÑA INCORRECTAS";  
			  } else if (logout != null) {  
			   message = "BIENVENIDO";  
			  }  
			 return model.addAttribute("login", message);  	 
		}
	@RequestMapping("/admin**")
	public String getAdminProfile(){
		return "index.htm";
	}
	@RequestMapping("/user**")
	public String getUserProfile(){
		return "index.htm";
	}
	@RequestMapping("/403")  
	 public Model getAccessDenied(Model model) {  
	  Authentication auth = SecurityContextHolder.getContext()  
	    .getAuthentication();  
	  String username = "";  
	  if (!(auth instanceof AnonymousAuthenticationToken)) {  
	   UserDetails userDetail = (UserDetails) auth.getPrincipal();  
	   username = userDetail.getUsername();  
	  }  
	  
	  return model.addAttribute("403", username);  
	 }  
  }
