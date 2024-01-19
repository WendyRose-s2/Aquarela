package com.generation.aquarela.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.aquarela.model.Categoria;


public interface CategoriaRepository  extends JpaRepository <Categoria,Long> {

	public List<Categoria> findAllByTipoContainingIgnoreCase (@Param("Tipo")String tipo);
	
}