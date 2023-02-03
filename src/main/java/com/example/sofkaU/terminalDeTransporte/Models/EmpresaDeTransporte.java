package com.example.sofkaU.terminalDeTransporte.Models;

import com.example.sofkaU.terminalDeTransporte.Repository.BusRepository;

import java.util.UUID;

public abstract class EmpresaDeTransporte {

    private String idEmpresa;


    public EmpresaDeTransporte() {
        idEmpresa = String.valueOf(UUID.randomUUID());
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }


    @Override
    public String toString() {
        return "EmpresaDeTransporte{" +
                "idEmpresa='" + idEmpresa + '\'' +
                ", busesDisponibles=" +
                '}';
    }
}
