package com.api.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.vendas.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
    
}
