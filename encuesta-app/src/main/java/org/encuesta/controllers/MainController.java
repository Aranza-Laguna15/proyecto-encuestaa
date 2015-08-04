package org.encuesta.controllers;

import java.util.List;

import org.encuesta.dao.UsuarioDaoImpl;
import org.encuesta.domain.Usuario;
import org.encuesta.domain.UsuariosDelete;
import org.encuesta.domain.UsuariosEdit;
import org.encuesta.domain.UsuariosNew;
import org.encuesta.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan("org.encuesta.service")
public class MainController {
	
	@Autowired
	public UsuarioService uS;
	UsuarioDaoImpl udao;
	//private ShaPasswordEncoder encoder=new ShaPasswordEncoder(256);
	
	@RequestMapping(value="/index.htm",method=RequestMethod.GET)
	public String adminIndex(Model model){
		/*List<Usuario> usuarios=uS.getUsuario();
		model.addAttribute("users",usuarios);
				*/
		return "index";
	}
	@RequestMapping(value="/users.htm",method=RequestMethod.GET)
	public String users(Model model){
		/*List<Usuario> usuarios=uS.getUsuario();
		model.addAttribute("users",usuarios);
				*/
		model.addAttribute("usuario", new Usuario());
		return "users";
	}
	
	@RequestMapping(value="/usersAll.htm",method=RequestMethod.GET)
	public String usersAll(Model model){
		List<Usuario> usuarios=uS.getUsuario();
		model.addAttribute("users",usuarios);
		model.addAttribute("usuario", new Usuario());
		return "usersAll";
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
	
	@RequestMapping(value="/usersNew.htm", method = RequestMethod.GET)
	public String userNew(Model model){
		List<UsuariosNew> usuarios=uS.getUsuariosNew();
		System.out.println("usuarios nuevos: "+usuarios);
		model.addAttribute("user_nuevos",usuarios);		
		return "usersNew";
	}
	
	@RequestMapping (value="/addUser.htm",method = RequestMethod.GET)
	  public String singleRequestUsuario(Model model){
		model.addAttribute("usuario",new Usuario());
		return "addUser";
	   }
	
	@RequestMapping(value="/addUser.htm" , method=RequestMethod.POST)
	public String addUser(Model model,@ModelAttribute("usuario") Usuario usuario){
		
		uS.addUser(usuario);
		model.addAttribute("us","USUARIO AGREGADO");
		System.out.println("AGREGADO ");
	
		return "addUserR";
	}
	
	@RequestMapping(value="/delete", method= RequestMethod.GET)
	public String deleteUser(@ModelAttribute("username")String username){
	
		uS.deleteUser(username);
		
		return "redirect:/usersAll.htm";
	}
	
	@RequestMapping(value="/edit", method= RequestMethod.GET)
	public String edit(@ModelAttribute("usuario") Usuario usuario, Model model,@RequestParam(value="username")String username){
		uS.updateUser(usuario);
		System.out.println("USERNAME EDITADO "+username);
		System.out.println("USUARIO EDITADO "+usuario);
		return "redirect:/usersAll.htm";
	}
}

/*
Usuario u = new Usuario();
u.setEnabled(true);
u.setName("Victor de la Cruz");
u.setUsername("5555555555");
u.setPassword(encoder.encodePassword("123456", u.getUsername()));
if(usuarioDao.saveUsuario(u))
	System.out.println("Usuario guardado en bd");
	
	*
	* @RequestParam(value = "username",required = true)String username,
			@RequestParam(value = "name",required = true)String name,@RequestParam(value = "password",required = true)
			String password, Usuario usuario)
	*/
