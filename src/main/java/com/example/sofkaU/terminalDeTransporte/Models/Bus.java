package com.example.sofkaU.terminalDeTransporte.Models;

import java.util.*;

public abstract class Bus {
    private String idBus = String.valueOf(UUID.randomUUID());
    private String destinoBus;
    private int numeroPasajeros;

    private String horarioBus;

    public Bus(String destino, int numeroPasajeros, String horario) {
        this.destinoBus = destino.toLowerCase();
        this.numeroPasajeros = numeroPasajeros;
        this.horarioBus = horario;
    }

    public Bus() {
    }

    public String getIdBus() {
        return idBus;
    }

    public void setIdBus(String idBus) {
        this.idBus = idBus;
    }

    public String getDestinoBus() {
        return destinoBus;
    }

    public void setDestinoBus(String destinoBus) {
        this.destinoBus = destinoBus;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros() {
        this.numeroPasajeros--;
    }

    public String getHorarioBus() {
        return horarioBus;
    }

    public void setHorarioBus(String horarioBus) {
        this.horarioBus = horarioBus;
    }
}
