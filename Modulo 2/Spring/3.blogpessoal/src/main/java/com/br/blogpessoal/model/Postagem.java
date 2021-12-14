package com.br.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Não separar o @Entity ou Table e etc, da class que será usadada

@Entity // create table
@Table(name = "tb_postagens") // tb_postagens
public class Postagem {

	@Id // primary key (id)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	private Long id;

	@NotBlank(message = "O atributo titulo é Obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo titulo deve ter no minimo 5 e no maximo 100 caracters")
	private String titulo;

	@NotNull(message = "O atributo titulo é Obrigatorio!")
	@Size(min = 5, max = 100, message = "O atributo titulo deve ter no minimo 5 e no maximo 100 caracters")
	private String texto;

	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne // N pra 1
	@JsonIgnoreProperties("postagem")
	private Tema tema; //Tema é um objeto
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;

	public Long getId() { // long = dado primitivo para indentificar um dado de 64 bit 
							// Long = seria a classe Wrapper ( que encapsula valor de um objeto)
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
