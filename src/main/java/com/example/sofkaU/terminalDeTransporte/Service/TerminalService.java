package com.example.sofkaU.terminalDeTransporte.Service;

import com.example.sofkaU.terminalDeTransporte.Models.Pasajero;
import com.example.sofkaU.terminalDeTransporte.Repository.BusRepository;
import com.example.sofkaU.terminalDeTransporte.Repository.EmpresaDeTransporteRepository;
import com.example.sofkaU.terminalDeTransporte.Repository.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TerminalService implements IterminalService {
    @Autowired
    TerminalRepository terminalRepository;
    @Autowired
    EmpresaDeTransporteRepository empresaDeTransporteRepository;

    @Override
    public List<Pasajero> mostrarRegistroPasajeros() {
        List<Pasajero> pasajeroList = new ArrayList<>();
        empresaDeTransporteRepository.getBusesDisponibles().stream().forEach(bus ->
        {
            if (bus.getPasajeros() != null) {
                bus.getPasajeros().stream().forEach(pasaj -> pasajeroList.add(pasaj));
                terminalRepository.setRegistroPasajeros(pasajeroList);
            }
        });
        return terminalRepository.getRegistroPasajeros();
    }

    @Override
    public List<BusRepository> mostrarRegistroBus() {
        List<BusRepository> busList = new ArrayList<>();
        empresaDeTransporteRepository.getBusesDisponibles().stream().forEach(bus ->
        {
            if (bus.getPasajeros().isEmpty()) {
               return;
            }else {busList.add(bus);
                terminalRepository.setRegistroBuses(busList);}
        });
        return busList;
    }

}
