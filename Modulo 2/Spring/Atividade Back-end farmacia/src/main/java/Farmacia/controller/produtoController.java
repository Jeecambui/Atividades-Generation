package Farmacia.controller;

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

import Farmacia.model.produto;
import Farmacia.repository.produtoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class produtoController {
	@Autowired
	private produtoRepository produtoRepository;

	@GetMapping
	public ResponseEntity<List<produto>> getAll() {
		return ResponseEntity.ok(produtoRepository.findAll());

		// select * from tb_produto; seleciona a tabela inteira
	}

	@GetMapping("/{id}")
	public ResponseEntity <produto> getById(@PathVariable Long id) { 
		return produtoRepository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());

		// select * from tb_produto where id = id;
	}

	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<produto>> getByNome(@PathVariable String nome) {
		return ResponseEntity.ok(produtoRepository.findAllByNomeContainingIgnoreCase(nome));

		// select * from tb_produto where nome like "%nome%";
	}
	
	@GetMapping("/nome/{nome}/elaboratorio/{laboratorio}")
	public ResponseEntity<List<produto>> getByNomeELaboratorio(@PathVariable String nome, @PathVariable String laboratorio){
		return ResponseEntity.ok(produtoRepository.findAllByNomeAndLaboratorioContainingIgnoreCase(nome, laboratorio));
	
		// select * from tb_produto where nome like "%nome%" 
		//								  and laboratorio like "%laboratorio%";
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<produto>> getByDescricao(@PathVariable String nome) {
		return ResponseEntity.ok(produtoRepository.findAllByNomeContainingIgnoreCase(nome));

		// select * from tb_produto where nome like "%nome%";
	}

	@PostMapping
	public ResponseEntity<produto> postTema(@RequestBody produto produto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
	}

	@PutMapping
	public ResponseEntity<produto> putProduto(@RequestBody produto produto)
	{
		return produtoRepository.findById(produto.getId())
				.map(resposta -> ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produto)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
				
		// Metodo para Alteração
	}
	
	@DeleteMapping(path = {"/{id}"}) //dúvida por que nao utilizou o map e orElse igual em PostagemController
	public ResponseEntity<?> deleteProduto (@PathVariable long id) 
	{
			return produtoRepository.findById(id)
					.map(record-> 
					{
						produtoRepository.deleteById(id);
						return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
					})
					.orElse(ResponseEntity.notFound().build());
	}
}
