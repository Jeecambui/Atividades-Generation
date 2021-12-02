package com.br.blogpessoal.repostory;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.br.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	public List <Postagem> findAllByTituloContainingIgnoreCase (String Titulo);
	
	// select * from tb_postagens where titulo like "%titulo%";
}