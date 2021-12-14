package MinhaLojaDeGames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import MinhaLojaDeGames.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
	
	public List<ProdutoModel> findAllByNomeContainingIgnoreCase(String nome);
	 
	public List <ProdutoModel> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
		 
	public List <ProdutoModel> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
	
}