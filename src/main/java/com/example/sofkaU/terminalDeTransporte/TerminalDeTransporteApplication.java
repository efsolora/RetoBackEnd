package com.example.sofkaU.terminalDeTransporte;

import com.example.sofkaU.terminalDeTransporte.Repository.BusRepository;
import com.example.sofkaU.terminalDeTransporte.Models.Pasajero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TerminalDeTransporteApplication {

    public static void main(String[] args) {

        SpringApplication.run(TerminalDeTransporteApplication.class, args);
    }


    @Bean
    public Pasajero contruirPasajero() {
        return new Pasajero("Andres", 30554354, "Marinilla");
    }
    @Bean
    public BusRepository contruirBusRepository() {
        return new BusRepository("Andres", 30554354, "Marinilla");
    }


}
