package com.hotel.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hotel.hotel.model.Reserva;
import com.hotel.hotel.service.ReservaService;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService service;

    @GetMapping
    public List<Reserva> listar() {
        return service.listar();
    }

    @PostMapping
    public Reserva guardar(@RequestBody Reserva reserva) {
        return service.guardar(reserva);
    }
}