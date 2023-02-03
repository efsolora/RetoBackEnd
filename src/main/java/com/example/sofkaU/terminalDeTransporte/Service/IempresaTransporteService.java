package com.example.sofkaU.terminalDeTransporte.Service;

import com.example.sofkaU.terminalDeTransporte.Repository.BusRepository;
import org.springframework.stereotype.Service;

@Service
public interface IempresaTransporteService {

    public BusRepository agregarBus(BusRepository bus);


    public void mostrarBusesDisponibles();
}
