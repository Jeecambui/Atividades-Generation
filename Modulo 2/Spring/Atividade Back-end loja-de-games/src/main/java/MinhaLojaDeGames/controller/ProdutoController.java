package MinhaLojaDeGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MinhaLojaDeGames.model.CategoriaModel;
import MinhaLojaDeGames.model.ProdutoModel;
import MinhaLojaDeGames.repository.CategoriaRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {

	@Autowired
	private long id;
	
	@GetMapping
	public ResponseEntity<List<ProdutoModel>> getAll() {
		return ResponseEntity.ok(produtoRepository.findAll());

		// select * from tb_categoria;
	}

	@GetMapping("/{id}")
	public ResponseEntity<CategoriaModel> getById(@PathVariable long id) {
		return CategoriaRepository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());

		// select * from tb_postagens where id = id;
	}
	
}
