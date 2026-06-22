package com.hotel.hotel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fechaEntrada;
    private String fechaSalida;

    private Long huespedId;
    private Long habitacionId;

    public Reserva() {
    }

    public Long getId() {
        return id;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public Long getHuespedId() {
        return huespedId;
    }

    public Long getHabitacionId() {
        return habitacionId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setHuespedId(Long huespedId) {
        this.huespedId = huespedId;
    }

    public void setHabitacionId(Long habitacionId) {
        this.habitacionId = habitacionId;
    }
}