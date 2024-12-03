package com.senaidev.spotify.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cantor")
public class CantorEntity {
	
	//Atributos

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cantor;
    
	@Column(name="nome")
	private String nome;
	
	@Column(name="idade")
	private int idade;
	
	@Column(name="altura")
	private double altura;
	
	@Column(name="ouvintes mensais")
	private int ouvintes_mensais;
	
	@Column(name="nacionalidades")
	private String nacionalidade;
	
	//Construtores
	
	public CantorEntity() {
		
	}
	
	public CantorEntity(Long id_cantor, String nome, int idade, double altura, int ouvintes_mensais, String nacionalidade) {
		this.id_cantor = id_cantor;
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.ouvintes_mensais = ouvintes_mensais;
		this.nacionalidade = nacionalidade;
	}
	
	//getters e setters

	public Long getId_cantor() {
		return id_cantor;
	}

	public void setId_cantor(Long id_cantor) {
		this.id_cantor = id_cantor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getOuvintes_mensais() {
		return ouvintes_mensais;
	}

	public void setOuvintes_mensais(int ouvintes_mensais) {
		this.ouvintes_mensais = ouvintes_mensais;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
}
