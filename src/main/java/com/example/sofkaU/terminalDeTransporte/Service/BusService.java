package com.example.sofkaU.terminalDeTransporte.Service;

import com.example.sofkaU.terminalDeTransporte.Models.Pasajero;
import com.example.sofkaU.terminalDeTransporte.Repository.BusRepository;
import com.example.sofkaU.terminalDeTransporte.Repository.EmpresaDeTransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BusService implements IbusService {
    @Autowired
    EmpresaDeTransporteRepository empresaDeTransporteRepository;


    @Override
    public Pasajero agregarPasajeroBus(Pasajero pasajero) {

        empresaDeTransporteRepository.getBusesDisponibles().stream().forEach(bus ->
        {
            if (pasajero.getDestino().toLowerCase().equals(bus.getDestinoBus().toLowerCase())) {
                bus.getPasajeros().add(pasajero);
            }
        });
        return pasajero;
    }

    @Override
    public List<Pasajero> mostrarPasajeroBus() {
        List<Pasajero> pasajeroList = new ArrayList<>();
        empresaDeTransporteRepository.getBusesDisponibles().stream().forEach(bus ->
        {
            if (bus.getPasajeros() != null) {
                bus.getPasajeros().stream().forEach(pasaj -> pasajeroList.add(pasaj));
            }
        });
        return pasajeroList;
    }
}
