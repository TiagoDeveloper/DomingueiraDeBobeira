package br.com.relojoaria.bomtempo.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.relojoaria.bomtempo.models.ObjetoComData;
import br.com.relojoaria.bomtempo.models.ObjetoTest;
import br.com.relojoaria.bomtempo.validator.DateValidator;
import br.com.relojoaria.bomtempo.validator.DateValidator2;

@Controller
@RequestMapping("/principal")
public class RelojoariaController {
	
	@Autowired
	private DateValidator dateValidator;
	
	@Autowired
	private DateValidator2 dateValidator2;
	
	@RequestMapping("/home")
	public String home(Model model, ObjetoTest objetoTest){
		model.addAttribute("title", "Relojoaria");
		model.addAttribute("title_body", "Relojoaria bom tempo");
		return "home";
	}
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String pegaDados(Model model, ObjetoTest objetoTest){
		System.out.println("Meu objeto ===> "+objetoTest.getDataHome());
		return "home";
	}
	@RequestMapping(value="/contato", method=RequestMethod.GET)
	public String contato(Model model){
		return "contato";
	}
	@RequestMapping(value="/request", method=RequestMethod.GET)
	public String contatoRequest(Model model,ObjetoComData objetoComData){
		System.out.println("Data: "+objetoComData);
		return "contato";
	}
	@RequestMapping(value="/contato", method=RequestMethod.POST)
	public String contato(Model model,ObjetoTest objetoTest){
		return "contato";
	}
	
	private List<ObjetoTest> listObjetoTest = new ArrayList<ObjetoTest>();
	
	@RequestMapping(value="/form-fragment", method=RequestMethod.POST)
	public String fragment(Model model,ObjetoTest objetoTest){
		listObjetoTest.add(objetoTest);
		model.addAttribute("objetoTest", listObjetoTest);		
		return "fragments/form-fragment::form";
	}
	@RequestMapping(value="/delete-fragment", method=RequestMethod.POST)
	public String deleteFragment(Model model,@RequestParam("id")int id){
		listObjetoTest.remove(id);
		model.addAttribute("objetoTest", listObjetoTest);		
		return "fragments/form-fragment::form";
	}
	@RequestMapping(value="/pageTest", method=RequestMethod.GET)
	public String pageTest(Model model,ObjetoComData objetoComData){
		return "pageTest";
	}
	@RequestMapping(value="/pageTest", method=RequestMethod.POST)
	public String pageTest(Model model,@Valid ObjetoComData objetoComData, BindingResult result){
		
		if(result.hasErrors()){
			System.out.println("Caiu aqui: "+model);
			Model model1 = model;
			return pageTest(model1,objetoComData);
		}
		
		System.out.println("Objeto com data: "+objetoComData);
		return "pageTest";
	}
	
	@InitBinder
	public void dataBind(WebDataBinder dataBinder){
		dataBinder.addValidators(dateValidator2,dateValidator);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		dataBinder.registerCustomEditor(Date.class, "data", new CustomDateEditor(dateFormat, true));
	}
	
}
