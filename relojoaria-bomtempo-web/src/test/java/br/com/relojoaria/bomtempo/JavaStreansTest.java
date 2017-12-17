package br.com.relojoaria.bomtempo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import br.com.relojoaria.bomtempo.models.Pessoa;

public class JavaStreansTest {
	
	private static List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private static ListaTiago<Pessoa> pessoas1;
	
	static{
		
		pessoas.addAll(Arrays.asList(
				
				new Pessoa("Tiago Pereira","Programador", LocalDate.now(),1.500),
				new Pessoa("Michelle Alessandra","Cinema e Animação", LocalDate.now(),1.500),
				new Pessoa("Pollyana Silva","Requisitos", LocalDate.now(),1.500),
				new Pessoa("Thales Carneiro","Advogado", LocalDate.now(),1.500),
				new Pessoa("Tânia Maria","Tecnico em enfermagem", LocalDate.now(),1.500),
				new Pessoa("Maria Alves","Oficial do ministério público", LocalDate.now(),1.500)
				
		));
		pessoas1.forEach(System.out::println);
	}
	
	
	@Test
	public void teste1(){
		
		
		pessoas.forEach(System.out::println);
		
		
	}
	
	
}
