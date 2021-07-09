package com.projetointer.desafio;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.bytebuddy.asm.Advice.This;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String email;
	private BigInteger digitoUnico;
	private BigInteger resultado;

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

	public BigInteger getDigitoUnico() {
		return digitoUnico;
	}

	public void setDigitoUnico(BigInteger digitoUnico) {
		this.digitoUnico = digitoUnico;
	}

	public BigInteger getResultado() {
		return resultado;
	}

	public void setResultado(BigInteger resultado) {
		this.resultado = resultado;
	}

	public void aplicaResultado() {

		this.setResultado(calculaDigitoUnico(this.digitoUnico));
	}

	public static BigInteger calculaDigitoUnico(BigInteger num) {
		 BigInteger dez = BigInteger.valueOf(10L);

		if (num.longValue() <= 10L) {
			return num;
		} else {

			return calculaDigitoUnico(num.divide(dez)).add(num.remainder(dez));
		}
	}

	/*
	 * public Long validaDigitoUnico(Long num) { if (num < 10) return num; else
	 * return validaDigitoUnico(num / 10) + num % 10; }
	 * 
	 */

}
