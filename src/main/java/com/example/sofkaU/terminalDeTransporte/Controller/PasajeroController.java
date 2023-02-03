package com.example.sofkaU.terminalDeTransporte.Controller;

import com.example.sofkaU.terminalDeTransporte.Repository.EmpresaDeTransporteRepository;
import com.example.sofkaU.terminalDeTransporte.Repository.BusRepository;
import com.example.sofkaU.terminalDeTransporte.Models.Pasajero;
import com.example.sofkaU.terminalDeTransporte.Service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/rest")
public class PasajeroController {

    @Autowired
    BusService busService;



    @GetMapping("/bring/all")
    public ResponseEntity GETtraerPasajeros() {

        return new ResponseEntity(busService.mostrarPasajeroBus(), HttpStatus.FOUND);
    }

    @PostMapping()
    public ResponseEntity mandarPasajeros(@RequestBody Pasajero pasajero) {
        return new ResponseEntity(busService.agregarPasajeroBus(pasajero), HttpStatus.CREATED);
    }}
