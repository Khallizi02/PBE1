package com.senaidev.mercado.entitie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_produtos;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "preco")
	private double preco;
	
	@ManyToOne
	@JoinColumn(name = "CATEGORIA_id_categoria")
	@Column(name = "categoria")
	private Categoria categoria;
	
	//Construtores
	public Produto(Long id_produtos, String nome, double preco) {
		super();
		this.id_produtos = id_produtos;
		this.nome = nome;
		this.preco = preco;
	}

	//Getters e Setters
	public Long getId_produtos() {
		return id_produtos;
	}

	public void setId_produtos(Long id_produtos) {
		this.id_produtos = id_produtos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
