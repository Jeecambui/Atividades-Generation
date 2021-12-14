package MinhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import MinhaLojaDeGames.model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
	
	public List<CategoriaModel> findAllByTipoContainingIgnoreCase(String tipo);

}