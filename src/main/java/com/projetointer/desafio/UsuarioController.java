package com.projetointer.desafio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService userServ;

	@RequestMapping("/")
	public String paginaInicial(Model model) {
	    List<Usuario> listUsuario = userServ.ListAll();
	    model.addAttribute("listUsuario", listUsuario);	     
	    return "index";
	}
	
	@RequestMapping("/cadastros")
	public String novoUsuario(Model model) {
		Usuario usuario = new Usuario();		
		model.addAttribute("usuario", usuario);		
	    return "cadastro";
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String salvarNovoUsuario(@ModelAttribute("usuario") Usuario usuario) {    
		userServ.saveUser(usuario);
	    return "redirect:/";
	}
	
	@RequestMapping("/editar/{id}")
	public ModelAndView editarUsuario(@PathVariable(name= "id") int id) {
		ModelAndView objedit = new ModelAndView("editar");		
		
		Usuario usuario = userServ.getUser(id);
		objedit.addObject("usuario", usuario);
		
		return objedit;
	}
	
	@RequestMapping("/excluir/{id}")
	public String excluiUsuario(@PathVariable(name = "id") int id) {			
		userServ.deleteUser(id);		
		return  "redirect:/";
	}
	
}
