package com.hotel.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.hotel.model.Huesped;
import com.hotel.hotel.repository.HuespedRepository;

@Service
public class HuespedService {

    @Autowired
    private HuespedRepository repository;

    public List<Huesped> listar() {
        return repository.findAll();
    }

    public Huesped guardar(Huesped huesped) {
        return repository.save(huesped);
    }
}