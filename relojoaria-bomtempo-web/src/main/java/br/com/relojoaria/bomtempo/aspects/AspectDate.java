package br.com.relojoaria.bomtempo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDate {
	
	
	@Before("execution(* br.com.relojoaria.bomtempo.models.ObjetoTest.setData(..))")
	public void testeSet(){
		
		System.out.println("caiu aqui set");
		
	}
	@Before("execution(* br.com.relojoaria.bomtempo.models.ObjetoTest.getData(..))")
	public void testeGet(){
		
		System.out.println("caiu aqui get");
		
	}
	@Before("execution(* br.com.relojoaria.bomtempo.controllers.RelojoariaController.pegaDados(..))")
	public void controller(){
		
		System.out.println("caiu aqui controller");
		
	}
	@Before("@annotation(br.com.relojoaria.bomtempo.annotations.Assistida)")
	public void annotations(){
		
		System.out.println("caiu aqui anotação");
		
	}

}
