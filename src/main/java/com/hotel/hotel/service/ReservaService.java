package com.hotel.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.hotel.model.Reserva;
import com.hotel.hotel.repository.ReservaRepository;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    public List<Reserva> listar() {
        return repository.findAll();
    }

    public Reserva guardar(Reserva reserva) {
        return repository.save(reserva);
    }
}