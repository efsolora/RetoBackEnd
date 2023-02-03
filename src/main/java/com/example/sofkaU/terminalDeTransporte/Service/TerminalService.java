package com.example.sofkaU.terminalDeTransporte.Service;

import com.example.sofkaU.terminalDeTransporte.Models.Pasajero;
import com.example.sofkaU.terminalDeTransporte.Repository.BusRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TerminalService implements IterminalService{
    @Override
    public List<Pasajero> mostrarRegistroPasajeros() {
        return null;
    }

    @Override
    public List<BusRepository> mostrarRegistroBus() {
        return null;
    }
}
