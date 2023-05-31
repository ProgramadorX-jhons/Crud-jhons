package com.jhons.myapp.service;


import com.jhons.myapp.respository.PedidoRepo;

import java.util.List;

public interface PedidoInterface {

    //esta clase son metodos que devemos implementar en el service

    List<PedidoRepo> obtenerClientes();
    PedidoRepo obtenerPorId(Long id);

    void guardarCliente(PedidoRepo pedidoRepo);

    void actualizarCliente(PedidoRepo pedidoRepo);

    void eliminarCliente(Long id);
}

