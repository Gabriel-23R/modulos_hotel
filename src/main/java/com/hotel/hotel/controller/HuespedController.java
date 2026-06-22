package com.hotel.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hotel.hotel.model.Huesped;
import com.hotel.hotel.service.HuespedService;

@RestController
@RequestMapping("/huespedes")
public class HuespedController {

    @Autowired
    private HuespedService service;

    @GetMapping
    public List<Huesped> listar() {
        return service.listar();
    }

    @PostMapping
    public Huesped guardar(@RequestBody Huesped huesped) {
        return service.guardar(huesped);
    }
}