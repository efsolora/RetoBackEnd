package com.example.sofkaU.terminalDeTransporte.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


public class Pasajero {


    private String nombre;
    private int cc;
    private String idPasajero;

    private String destino;


    public Pasajero(String nombre, int cc, String destino) {
        this.nombre = nombre;
        this.cc = cc;
        idPasajero = String.valueOf(UUID.randomUUID());
        this.destino = destino.toLowerCase();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(String idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }


}
