package com.example.sofkaU.terminalDeTransporte.Repository;

import com.example.sofkaU.terminalDeTransporte.Models.Pasajero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TerminalRepository {

    private List<BusRepository> registroBuses;
    private List<Pasajero> registroPasajeros;

    public TerminalRepository() {
        this.registroBuses = new ArrayList<>(List.of());
        this.registroPasajeros = new ArrayList<>(List.of());
    }

    public List<BusRepository> getRegistroBuses() {
        return registroBuses;
    }

    public void setRegistroBuses(List<BusRepository> registroBuses) {
        this.registroBuses = registroBuses;
    }

    public List<Pasajero> getRegistroPasajeros() {
        return registroPasajeros;
    }

    public void setRegistroPasajeros(List<Pasajero> registroPasajeros) {
        this.registroPasajeros = registroPasajeros;
    }

    @Override
    public String toString() {
        return "TerminalRepository{" +
                "registroBuses=" + registroBuses +
                ", registroPasajeros=" + registroPasajeros +
                '}';
    }
}
