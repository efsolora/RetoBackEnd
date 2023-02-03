package com.example.sofkaU.terminalDeTransporte.Service;

import com.example.sofkaU.terminalDeTransporte.Repository.BusRepository;
import com.example.sofkaU.terminalDeTransporte.Repository.EmpresaDeTransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaTransporteService implements IempresaTransporteService {

    @Autowired
    EmpresaDeTransporteRepository empresaDeTransporteRepository;


    @Override
    public BusRepository agregarBus(BusRepository bus) {
        BusRepository nuevoBUS = new BusRepository(bus.getDestinoBus(), bus.getNumeroPasajeros(), bus.getHorarioBus());
        empresaDeTransporteRepository.getBusesDisponibles().add(nuevoBUS);
        return nuevoBUS;
    }

    @Override
    public void mostrarBusesDisponibles() {
        empresaDeTransporteRepository.getBusesDisponibles();
    }
}
