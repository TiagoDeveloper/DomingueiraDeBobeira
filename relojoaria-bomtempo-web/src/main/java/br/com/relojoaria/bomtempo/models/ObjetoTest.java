package br.com.relojoaria.bomtempo.models;

import org.springframework.stereotype.Component;

import br.com.relojoaria.bomtempo.annotations.Assistida;

@Component
public class ObjetoTest {
	
	private String data;
	
	public String getData() {
		return data;
	}
	@Assistida
	public void setData(String data) {
		this.data = data;
	}
}
