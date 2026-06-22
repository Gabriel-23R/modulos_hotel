package com.hotel.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel.hotel.model.Habitacion;

public interface HabitacionRepository extends JpaRepository<Habitacion, Long> {

}