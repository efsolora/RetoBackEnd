package com.example.sofkaU.terminalDeTransporte.Service;

import com.example.sofkaU.terminalDeTransporte.Models.Pasajero;
import com.example.sofkaU.terminalDeTransporte.Repository.BusRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IterminalService {

    List<Pasajero> mostrarRegistroPasajeros();
    List<BusRepository> mostrarRegistroBus();
}
