package com.projetointer.desafio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String email;
	private Long digitoUnico;
	private Long resultado;

	public Usuario() {
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getDigitoUnico() {
		return digitoUnico;
	}

	public void setDigitoUnico(Long digitoUnico) {
		this.digitoUnico = digitoUnico;

	}

	public Long getResultado() {
		resultado = digitoUnico(digitoUnico);
		return resultado;
	}

	public Long setResultado(Long resultado) {

		this.resultado = resultado;

		return resultado;
	}

	public Long digitoUnico(Long num) {
		if (num < 10)
			return num;
		else
			return digitoUnico(num / 10) + num % 10;
	}

	public Usuario(Integer id, String nome, String email, Long digitoUnico) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.digitoUnico = digitoUnico;
	}

}
