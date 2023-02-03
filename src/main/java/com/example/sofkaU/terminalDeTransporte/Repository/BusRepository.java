package com.example.sofkaU.terminalDeTransporte.Repository;

import com.example.sofkaU.terminalDeTransporte.Models.Bus;
import com.example.sofkaU.terminalDeTransporte.Models.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;


@Repository
public class BusRepository extends Bus {

    private List<Pasajero> pasajeros;

    public BusRepository(String destino, int numeroPasajeros, String horario) {
        super(destino, numeroPasajeros, horario);
        pasajeros = new ArrayList<>(List.of());
    }

    public BusRepository() {
        pasajeros = new ArrayList<>(List.of());
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }



    @Override
    public String toString() {
        return "BusService{" +
                "pasajeros=" + pasajeros +
                "} " + super.toString();
    }
}
