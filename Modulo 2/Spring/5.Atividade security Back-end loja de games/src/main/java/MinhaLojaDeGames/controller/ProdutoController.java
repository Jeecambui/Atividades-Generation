package MinhaLojaDeGames.controller;

import java.math.BigDecimal;
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

import MinhaLojaDeGames.model.ProdutoModel;
import MinhaLojaDeGames.repository.CategoriaRepository;
import MinhaLojaDeGames.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	public ResponseEntity<List<ProdutoModel>> getAll() {
		return ResponseEntity.ok(produtoRepository.findAll());

		// select * from tb_categoria;
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProdutoModel> getById(@PathVariable Long id){
		return produtoRepository.findById(id)
			.map(resp-> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());

		// select * from tb_postagens where id = id;
	}

	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<ProdutoModel>> getByNome(@PathVariable String nome) {
		return ResponseEntity.ok(produtoRepository.findAllByNomeContainingIgnoreCase(nome));
	}

	@PostMapping
	public ResponseEntity<ProdutoModel> postProduto(@Valid @RequestBody ProdutoModel produto){
		return categoriaRepository.findById(produto.getCategoria().getId())
				.map(resposta -> {
					return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
				})
				.orElse(ResponseEntity.notFound().build());
	}

	@PutMapping
	public ResponseEntity<ProdutoModel> putProduto(@Valid @RequestBody ProdutoModel produto) {

		return produtoRepository.findById(produto.getId())
				.map(resposta -> {
					return ResponseEntity.ok().body(produtoRepository.save(produto));
		})
				.orElse(ResponseEntity.notFound().build());

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProduto(@PathVariable Long id) {

		return produtoRepository.findById(id)
				.map(resposta -> {
					produtoRepository.deleteById(id);
					return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
				})
				.orElse(ResponseEntity.notFound().build());
	}

	//  preço maior digitado emm ordem crescente

	@GetMapping("/preco_maior/{preco}")
	public ResponseEntity<List<ProdutoModel>> getPrecoMaiorQue(@PathVariable BigDecimal preco) {
		return ResponseEntity.ok(produtoRepository.findByPrecoGreaterThanOrderByPreco(preco));
	}

	// preço menor  digitado em ordem decrescente

	@GetMapping("/preco_menor/{preco}")
	public ResponseEntity<List<ProdutoModel>> getPrecoMenorQue(@PathVariable BigDecimal preco) {
		return ResponseEntity.ok(produtoRepository.findByPrecoLessThanOrderByPrecoDesc(preco));
	}

}
