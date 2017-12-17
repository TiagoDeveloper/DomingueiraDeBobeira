package br.com.relojoaria.bomtempo.controllers;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.relojoaria.bomtempo.models.ObjetoTest;
import br.com.relojoaria.bomtempo.models.Pessoa;

@Controller
@RequestMapping("/page")
public class PageController {
	
	private final String HOME = "page/home";
	private final String SAVE = "/page/save";
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(Pessoa pessoa,ObjetoTest objetoTest){
		
		return HOME;
	}
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String home(Model model, @Valid Pessoa pessoa,BindingResult resultPessoa, @Valid ObjetoTest objetoTest, BindingResult resultObjeto){
		
		if(resultPessoa.hasErrors() || resultObjeto.hasErrors()){
			return this.home(pessoa,objetoTest);
		}
		
		return "redirect:"+SAVE;
	}
	@RequestMapping(value="/save", method=RequestMethod.GET)
	public String save(Model model){
		
		return SAVE;
	}
	
	public void dateAndTime(LocalDate date, LocalTime time){
		
	}
}
