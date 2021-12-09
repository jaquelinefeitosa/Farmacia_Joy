package com.farmacia.farmacia_joy.repository;

import java.util.List;

import com.farmacia.farmacia_joy.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao); 
   
}
