package com.senaidev.bancolivraria.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class PedidoEntity {
	
	//Atributo 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pedido;
	
	@Column(name="dt_pedido",nullable = false)
	private Date dt_pedido;
	
	@Column(name="fm_pagamento", nullable = false,length = 100)
	private String fm_pagamento;
	
	//Construtores
	
	public PedidoEntity() {
		
	}
	
	public PedidoEntity(Long id_pedido,Date dt_pedido,String fm_pagamento) {
		this.id_pedido= id_pedido;
		this.dt_pedido = dt_pedido;
		this.fm_pagamento = fm_pagamento;
		
	}
	
	//Getters e Setters

	public Long getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public Date getDt_pedido() {
		return dt_pedido;
	}

	public void setDt_pedido(Date dt_pedido) {
		this.dt_pedido = dt_pedido;
	}

	public String getFm_pagamento() {
		return fm_pagamento;
	}

	public void setFm_pagamento(String fm_pagamento) {
		this.fm_pagamento = fm_pagamento;
	}
	
	

}
