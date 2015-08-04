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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

	@RequestMapping(value="/login.htm", method = RequestMethod.GET)
	public String getLoginForm(@ModelAttribute Usuario usuario, @RequestParam(value="error", required=false) String error,
			@RequestParam(value="logout", required=false)String logout, Model model){
		String message="";
		if (error != null) {  
			   message = "USUARIO o CONTRASEÑA INCORRECTAS";  
			  } else if (logout != null) {  
			   message = "BIENVENIDO";  
			   return "principal.htm";
			  }  
			 model.addAttribute("message", message);  	
			 return "login";
		}
	@RequestMapping("/principal**")
	public String getAdminProfile(){
		return "principal.htm";
	}
	
	@RequestMapping("/403.htm")  
	 public String getAccessDenied(Model model) {  
	  Authentication auth = SecurityContextHolder.getContext()  
	    .getAuthentication();  
	  String username = "";  
	  if (!(auth instanceof AnonymousAuthenticationToken)) {  
	   UserDetails userDetail = (UserDetails) auth.getPrincipal();  
	   username = userDetail.getUsername();  
	  }  
	  
	  model.addAttribute("403", username);  
	  return "403";
	 }  
  }
