package br.com.relojoaria.bomtempo.models;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import br.com.relojoaria.bomtempo.annotations.Assistida;

@Component
public class ObjetoTest {
	
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dataHome;
	
	public Date getDataHome() {
		return dataHome;
	}
	@Assistida
	public void setDataHome(Date dataHome) {
		this.dataHome = dataHome;
	}
}
