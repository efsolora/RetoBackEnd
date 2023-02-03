package com.example.sofkaU.terminalDeTransporte.Service;

import com.example.sofkaU.terminalDeTransporte.Models.Pasajero;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IbusService {
    Pasajero agregarPasajeroBus(Pasajero pasajeroService);
    List<Pasajero> mostrarPasajeroBus();
}
