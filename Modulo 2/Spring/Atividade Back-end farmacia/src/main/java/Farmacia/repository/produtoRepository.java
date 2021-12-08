package Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Farmacia.model.produto;

@Repository
public interface produtoRepository extends JpaRepository<produto, Long> {

	public List<produto> findAllByNomeContainingIgnoreCase(String nome);

	public List<produto> findAllByLaboratorioContainingIgnoreCase(String laboratorio); 
	
	public List<produto> findAllByNomeAndLaboratorioContainingIgnoreCase(String nome, String laboratorio); 
	
	// Feito usando de exemplo o link: https://stackoverflow.com/questions/32796419/crudrepository-findby-method-signature-with-multiple-in-operators
}
