package com.br.blogpessoal.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

// Nunca separar o @Entity ou Table e etc, da class que será usadada

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
	private String textoString;

	@UpdateTimestamp
	private LocalDate data;

	public Long getId() { // long = dado primitivo para indentificar um dado de 64 bit 
							// Long = seria a classe Wrapper ( que encapsula valor de um objeto)

		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTextoString() {
		return textoString;
	}

	public void setTextoString(String textoString) {
		this.textoString = textoString;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
}
