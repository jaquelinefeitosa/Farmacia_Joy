package com.farmacia.farmacia_joy.repository;

import java.util.List;

import com.farmacia.farmacia_joy.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    public List<Produto> findAllByDescricaoContainingIgnoreCase (String descricao); 


}
