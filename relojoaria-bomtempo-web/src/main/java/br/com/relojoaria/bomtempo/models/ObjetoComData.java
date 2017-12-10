package br.com.relojoaria.bomtempo.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Tiago
 *
 */
public class ObjetoComData {
	
	private String nome;
//	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date data;
	public ObjetoComData() {
	}
	public ObjetoComData(String nome, Date data) {
		this.nome = nome;
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ObjetoComData [nome=" + nome + ", data=" + data + "]";
	}
}
