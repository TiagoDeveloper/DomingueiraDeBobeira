package br.com.relojoaria.bomtempo.models;

import java.time.LocalDate;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;







public class Pessoa {
	
	@NotBlank
	private String nome;
	private String cargo;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dataNascimento;
	private Double salario;
	
	public Pessoa(String nome, String cargo, LocalDate dataNascimento, Double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}
	public Pessoa() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cargo=" + cargo + ", dataNascimento=" + dataNascimento + ", salario=" + salario + "]";
	}
}
