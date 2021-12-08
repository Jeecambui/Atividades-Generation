package MinhaLojaDeGames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MinhaLojaDeGames.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> 
{
	public List<ProdutoModel> findAllByNomeContainingIgnoreCase(String nome);

	/** MySQL: select * from tb_produtos where preco > preco order by preco; */
	 
	public List <ProdutoModel> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	/** MySQL: select * from tb_produtos where preco < preco order by preco; */
	 
	public List <ProdutoModel> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
}
