package Farmacia.controller;

import java.util.List;

import javax.validation.Valid;

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

import Farmacia.model.categoria;
import Farmacia.model.produto;
import Farmacia.repository.categoriaRepository;

@RestController
@RequestMapping("/categorias")
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class categoriaController {
	
		@Autowired
		private categoriaRepository categoriaRepository;

		@GetMapping
		public ResponseEntity<List <categoria>> getAll(){
			return ResponseEntity.ok(categoriaRepository.findAll());

			// select * from tb_categorias;
		}

		@GetMapping("/{id}")
		public ResponseEntity<categoria> getById(@PathVariable long id) {
			return categoriaRepository.findById(id)
					.map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());

			// select * from tb_categoria where id = id;
		}
		
		@GetMapping("/categoria/{categoria}")
		public ResponseEntity<List<categoria>> getByCategoria(@PathVariable String categoria) {
			return ResponseEntity.ok(categoriaRepository.findAllByCategoriaContainingIgnoreCase(categoria));

			// select * from tb_categoria where categoria like "%categoria%";
		}

		@PostMapping
		public ResponseEntity<categoria> postCategoria(@Valid @RequestBody categoria categoria) {
			return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
		}
		
		@PutMapping
		public ResponseEntity<categoria> puTema(@RequestBody categoria categoria)
		{
			return categoriaRepository.findById(categoria.getId()) //nao sei o erro
					.map(resposta -> ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.save(categoria)))
					.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<?> deleteCategoria(@PathVariable long id) {
			
			return categoriaRepository.findById(id)
					.map(resposta -> {
						categoriaRepository.deleteById(id);
						return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
					})
					.orElse(ResponseEntity.notFound().build());
		}
	}

