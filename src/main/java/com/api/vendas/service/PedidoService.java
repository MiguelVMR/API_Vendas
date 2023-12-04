package com.api.vendas.service;

import com.api.vendas.dto.PedidoDTO;
import com.api.vendas.model.Pedido;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
}

