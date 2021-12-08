package Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Farmacia.model.categoria;

@Repository
public interface categoriaRepository extends JpaRepository<categoria, Long> {
	public List<categoria> findAllByCategoriaContainingIgnoreCase(String categoria);
}
