package br.edu.ifrs.canoas.tcc.sisbov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifrs.canoas.tcc.sisbov.model.Animal;
import br.edu.ifrs.canoas.tcc.sisbov.repository.Animais;


@Controller
@RequestMapping("/animais")
public class AnimaisController {


	@Autowired
	private Animais animais;

	
	@GetMapping
	public ModelAndView listar() { 
		ModelAndView modelAndView = new ModelAndView("ListaAnimais");
		
		modelAndView.addObject("animais", animais.findAll());
		modelAndView.addObject("animal", new Animal());
		
		return modelAndView;
	}

	@PostMapping
	public String salvar(Animal animal) {
		this.animais.save(animal);
		
		return "redirect:/animais";
	}	
}