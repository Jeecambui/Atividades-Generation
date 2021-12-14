package com.br.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.blogpessoal.model.Tema;
import com.br.blogpessoal.repository.TemaRepository;

@RestController
@RequestMapping("/temas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TemaController {

	@Autowired
	private TemaRepository temaRepository;

	@GetMapping
	public ResponseEntity<List<Tema>> getAll() {
		return ResponseEntity.ok(temaRepository.findAll());

		// select * from tb_postagens; seleciona a tabela inteira
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tema> getById(@PathVariable long id) {
		return temaRepository.findById(id)
			.map(respostaTema -> ResponseEntity.ok(respostaTema))
			.orElse(ResponseEntity.notFound().build());
		// select * from tb_temas where id = id; seleciona um tema só
	}

	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Tema>> getByDescricao(@PathVariable String descricao) {
		return ResponseEntity.ok(temaRepository.findAllByDescricaoContainingIgnoreCase(descricao));

		// select * from tb_temas where titulo like "%titulo%";
	}

	@PostMapping
	public ResponseEntity<Tema> postTema(@RequestBody Tema tema)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(temaRepository.save(tema));
				// Metodo para Postar
	}

	@PutMapping
	public ResponseEntity<Tema> putTema(@RequestBody Tema tema)
	{
		return temaRepository.findById(tema.getId())
				.map(resposta -> ResponseEntity.status(HttpStatus.OK).body(temaRepository.save(tema)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
				
		// Metodo para Alteração
	}
	
	@DeleteMapping(path = {"/{id}"}) //dúvida por que nao utilizou o map e orElse igual em PostagemController
	public ResponseEntity<?> delete (@PathVariable long id) 
	{
			return temaRepository.findById(id)
					.map(record-> 
					{
						temaRepository.deleteById(id);
						return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
					})
					.orElse(ResponseEntity.notFound().build());
	}
}