package com.example.sofkaU.terminalDeTransporte.Controller;

import com.example.sofkaU.terminalDeTransporte.Repository.TerminalRepository;
import com.example.sofkaU.terminalDeTransporte.Service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TerminalControler {

    @Autowired
    TerminalRepository terminalRepository;
    @Autowired
    TerminalService terminalService;
    @GetMapping("/bring")
    public ResponseEntity GETtraerRegistroPasajeros() {

        return new ResponseEntity(terminalService.mostrarRegistroPasajeros(), HttpStatus.FOUND);
    }

    @GetMapping("/bring2")
    public ResponseEntity GETtraerRegistroBuses() {

        return new ResponseEntity(terminalService.mostrarRegistroBus(), HttpStatus.FOUND);
    }
}
