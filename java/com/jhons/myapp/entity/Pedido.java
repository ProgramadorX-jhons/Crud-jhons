package com.jhons.myapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nPedido;
    private String fechaHora;
    private String estadoPedido;
    private String totalPedido;

    //metodos

    public Pedido() {
    }

    //con parametros

    public Pedido(Long id, String nPedido, String fechaHora, String estadoPedido, String totalPedido) {
        this.id = id;
        this.nPedido = nPedido;
        this.fechaHora = fechaHora;
        this.estadoPedido = estadoPedido;
        this.totalPedido = totalPedido;
    }
    //getters y setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getnPedido() {
        return nPedido;
    }

    public void setnPedido(String nPedido) {
        this.nPedido = nPedido;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(String totalPedido) {
        this.totalPedido = totalPedido;
    }
}
