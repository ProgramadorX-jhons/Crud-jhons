package com.jhons.myapp.service;


import com.jhons.myapp.entity.Mesa;

import java.util.List;

public interface MesaInterface {

    //esta clase devemos implementar los metodoso en el sercice

    List<Mesa> obtenerClientes();
    Mesa obtenerPorId(Long id);

    void guardarCliente(Mesa mesa);

    void actualizarCliente(Mesa mesa);

    void eliminarCliente(Long id);
}

