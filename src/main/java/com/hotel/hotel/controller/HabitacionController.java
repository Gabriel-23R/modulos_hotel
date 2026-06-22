package com.hotel.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hotel.hotel.model.Habitacion;
import com.hotel.hotel.service.HabitacionService;

@RestController
@RequestMapping("/habitaciones")
public class HabitacionController {

    @Autowired
    private HabitacionService service;

    @GetMapping
    public List<Habitacion> listar() {
        return service.listar();
    }

    @PostMapping
    public Habitacion guardar(@RequestBody Habitacion habitacion) {
        return service.guardar(habitacion);
    }
}