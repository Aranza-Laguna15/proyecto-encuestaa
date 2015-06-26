package org.encuesta.controllers;

import java.util.List;
import org.encuesta.domain.Usuario;
import org.encuesta.domain.UsuariosDelete;
import org.encuesta.domain.UsuariosEdit;
import org.encuesta.domain.UsuariosNew;
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
public class MainController {
	
	@Autowired
	public UsuarioService uS;
	//private ShaPasswordEncoder encoder;
	
	@RequestMapping(value="/index.htm",method=RequestMethod.GET)
	public String adminIndex(Model model){
		/*List<Usuario> usuarios=uS.getUsuario();
		model.addAttribute("users",usuarios);
				*/
		return "index";
	}
	
	@RequestMapping(value="/hola.htm",method=RequestMethod.GET)
	public String otroMapping(Model model,
			@RequestParam(value="nombre",required=true,defaultValue="Victor")String nombre){
		model.addAttribute("hola", "Hola: "+nombre);
		return "hola";
	}
	
	@RequestMapping(value="/usersDel.htm",method=RequestMethod.GET)
	public String userDelete(Model model){
		List<UsuariosDelete> usuarios=uS.getUsuariosDelete();
		System.out.println("usuarios eliminados: "+usuarios);
		model.addAttribute("user_eliminados",usuarios);		
		return "usersDel";
	}
	
	@RequestMapping(value="/usersEdit.htm",method=RequestMethod.GET)
	public String userEdit(Model model){
		List<UsuariosEdit> usuarios=uS.getUsuariosEdit();
		System.out.println("usuarios editados: "+usuarios);
		model.addAttribute("user_editados",usuarios);		
		return "usersEdit";
	}
	
	@RequestMapping(value="/usersNew.htm",method=RequestMethod.GET)
	public String userNew(Model model){
		List<UsuariosNew> usuarios=uS.getUsuariosNew();
		System.out.println("usuarios nuevos: "+usuarios);
		model.addAttribute("user_nuevos",usuarios);		
		return "usersNew";
	}
}

/*
Usuario u = new Usuario();
u.setEnabled(true);
u.setName("Victor de la Cruz");
u.setUsername("5555555555");
u.setPassword(encoder.encodePassword("123456", u.getUsername()));
if(usuarioDao.saveUsuario(u))
	System.out.println("Usuario guardado en bd");*/
