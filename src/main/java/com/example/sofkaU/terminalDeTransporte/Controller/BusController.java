package com.example.sofkaU.terminalDeTransporte.Controller;

import com.example.sofkaU.terminalDeTransporte.Repository.EmpresaDeTransporteRepository;
import com.example.sofkaU.terminalDeTransporte.Repository.BusRepository;
import com.example.sofkaU.terminalDeTransporte.Service.EmpresaTransporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class BusController {

    @Autowired
    EmpresaDeTransporteRepository empresaDeTransporte;
    @Autowired
    EmpresaTransporteService empresaDeTransporteService;


    @GetMapping("/bring")
    public ResponseEntity GETtraerBusesDisponibles() {

        return new ResponseEntity(empresaDeTransporte.getBusesDisponibles(), HttpStatus.FOUND);
    }

    @PostMapping()
    public ResponseEntity mandarPasajeros(@RequestBody BusRepository busService) {

        return new ResponseEntity(empresaDeTransporteService.agregarBus(busService), HttpStatus.CREATED);
    }}

