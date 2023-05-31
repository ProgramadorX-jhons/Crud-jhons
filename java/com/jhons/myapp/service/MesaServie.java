package com.jhons.myapp.service;

import com.jhons.myapp.entity.Mesa;
import com.jhons.myapp.respository.MesaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MesaServie implements MesaInterface{
    //implementamos la interface repository
    @Autowired
    private MesaRepo mesaRepo;

    @Override
    public List<Mesa> obtenerClientes() {
        return this.mesaRepo.findAll();
    }

    @Override
    public Mesa obtenerPorId(Long id) {
        return mesaRepo.findById(id).orElse(null);
    }

    @Override
    public void guardarCliente(Mesa mesa) {
        this.mesaRepo.save(mesa);

    }

    @Override
    public void actualizarCliente(Mesa mesa) {
        this.mesaRepo.save(mesa);
    }

    @Override
    public void eliminarCliente(Long id) {
        this.mesaRepo.deleteById(id);
    }
}
