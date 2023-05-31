package com.jhons.myapp.service;

import com.jhons.myapp.entity.Empleado;

import java.util.List;

public interface EmpleadoInterface {

    //este  metodos devemos implentar en la clase service
    List<Empleado> obtenerClientes();
    Empleado obtenerPorId(Long id);

    void guardarCliente(Empleado empleado);

    void actualizarCliente(Empleado empleado);

    void eliminarCliente(Long id);
}

