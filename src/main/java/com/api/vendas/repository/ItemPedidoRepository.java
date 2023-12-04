package com.api.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.vendas.model.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido,Integer> {
    
}
