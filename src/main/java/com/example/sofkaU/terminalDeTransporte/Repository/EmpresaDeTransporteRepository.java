package com.example.sofkaU.terminalDeTransporte.Repository;

import com.example.sofkaU.terminalDeTransporte.Models.EmpresaDeTransporte;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpresaDeTransporteRepository extends EmpresaDeTransporte {

    private List<BusRepository> busesDisponibles;

    public EmpresaDeTransporteRepository() {
        busesDisponibles = new ArrayList<>(List.of(new BusRepository("Marinilla", 30, "2023/02/4:12:00"),
                new BusRepository("Cartagena", 30, "2023/02/4:6:00"),
                new BusRepository("Pereira", 30, "2023/02/4:18:00")));
    }


    public List<BusRepository> getBusesDisponibles() {
        return busesDisponibles;
    }

    public void setBusesDisponibles(List<BusRepository> busesDisponibles) {
        this.busesDisponibles = busesDisponibles;
    }

    @Override
    public String toString() {
        return "EmpresaDeTransporteRepository{" +
                "busesDisponibles=" + busesDisponibles +
                "} " + super.toString();
    }
}
