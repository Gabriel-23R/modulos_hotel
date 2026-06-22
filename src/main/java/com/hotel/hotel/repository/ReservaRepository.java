package com.hotel.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel.hotel.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}