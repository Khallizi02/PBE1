package com.senaidev.spotify.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class MusicaEntity {

	//Atributos

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_musica;
	    
		@Column(name="nome")
		private String nome;
		
		@Column(name="tempo")
		private double tempo;
		
		@Column(name="estilo")
		private String estilo;
		
		@ManyToOne
		@JoinColumn(name="CANTOR_id_cantor")
		@Column(name="cantor")
		private String cantor;
		
		//Construtores
		
		public MusicaEntity() {
			
		}
		
		public MusicaEntity(Long id_musica, String nome, double tempo, String estilo) {
			this.id_musica = id_musica;
			this.nome = nome;
			this.tempo = tempo;
			this.estilo = estilo;
	    }
		
		//getters e setters

		public Long getId_musica() {
			return id_musica;
		}

		public void setId_musica(Long id_musica) {
			this.id_musica = id_musica;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getTempo() {
			return tempo;
		}

		public void setTempo(double tempo) {
			this.tempo = tempo;
		}

		public String getEstilo() {
			return estilo;
		}

		public void setEstilo(String estilo) {
			this.estilo = estilo;
		}

		public String getCantor() {
			return cantor;
		}

		public void setCantor(String cantor) {
			this.cantor = cantor;
		}
		
		
}
