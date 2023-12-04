package com.api.vendas.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.api.vendas.model.Pedido;
import com.api.vendas.model.Cliente;

public interface PedidoRepository extends JpaRepository<Pedido,Integer> {
    
    List<Pedido> findByCliente(Cliente cliente);
}
