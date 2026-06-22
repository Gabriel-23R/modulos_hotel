package com.hotel.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.hotel.model.Habitacion;
import com.hotel.hotel.repository.HabitacionRepository;

@Service
public class HabitacionService {

    @Autowired
    private HabitacionRepository repository;

    public List<Habitacion> listar() {
        return repository.findAll();
    }

    public Habitacion guardar(Habitacion habitacion) {
        return repository.save(habitacion);
    }
}