package com.jhons.myapp.controller;

import com.jhons.myapp.entity.Cliente;
import com.jhons.myapp.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> obtenerTodos(){
        return clienteService.obtenerClientes();
    }

    @GetMapping("/{id}")
    public Cliente obtenerPorId(Long id){
        return clienteService.obtenerPorId(id);
    }

    @PostMapping
    public void guardarCliente(Cliente cliente){
        clienteService.guardarCliente(cliente);
    }

    @PutMapping("/{id}")
    public void actualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente){
        Cliente clienteActual = clienteService.obtenerPorId(id);

        if(clienteActual != null){
            clienteActual.setNombre(cliente.getNombre());
            clienteActual.setDirrecion(cliente.getDirrecion());
            clienteActual.setnTelefono(cliente.getnTelefono());
            clienteActual.setEmail(cliente.getEmail());
            clienteService.actualizarCliente(clienteActual);
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Long id){
        clienteService.eliminarCliente(id);
    }


}
