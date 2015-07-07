package org.encuesta.controllers;

import org.encuesta.beans.BeanExample;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by vcgdev on 24/06/15.
 */
@Controller
public class ExampleController {

	@RequestMapping(value="/reportes.htm",method=RequestMethod.GET)
	public String reportes(Model model){
		return "reportes";
	}
    /**
     * Este metodo responde al GET del mapping example1.htm
     * */
    @RequestMapping(value = "/example1.htm",method = RequestMethod.GET)
    public String singleRequest(){
        return "example/example1";
    }

    /**
     * Este metodo responde al POST del mapping example1.htm al hacer submit en la pagina
     * */
    @RequestMapping(value = "/example1.htm",method = RequestMethod.POST)
    public String singleRequest(Model model,@RequestParam(value = "paramValue",required = true)String paramValue){
        /**
         * El parametro trae el valor del jsp puedes usarlo para lo que desees
         * */
        System.out.println(paramValue);
        model.addAttribute("paramValue", paramValue);
        return "example/example1result";
    }

    /**
     * Para el segundo ejemplo de binding se creo una clase BeanExample en el paquete org.encuesta.beans el cual contiene solo un atributo que nos interesa
     * obtener en el request
     * */

    /*
    * Metodo get
    * */

    @RequestMapping(value = "/example2.htm",method = RequestMethod.GET)
    public String example2(Model model){
        model.addAttribute("bean",new BeanExample());// el attributo que estamos agregando al modelo se llama "bean" sera el que nos ayude a hacer el binding
        return "example/example2";
    }

    /**
     * metodo post
     * */
    @RequestMapping(value = "/example2.htm",method = RequestMethod.POST)
    public String example2(Model model,@ModelAttribute(value = "bean")BeanExample bean){
        /**
         * en el parametro bean esta la informacion que viene del jsp
         * */
         System.out.println("Valor: "+bean.getSearchValue());
         model.addAttribute("bean",bean);
         return "example/example2result";
    }
  }
