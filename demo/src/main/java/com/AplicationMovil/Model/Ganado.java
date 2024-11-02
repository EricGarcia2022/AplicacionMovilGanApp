package com.tu_paquete.model;

import javax.persistence.*;

@Entity
public class Ganado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String raza;
    private int edad;

    @ManyToOne
    @JoinColumn(name = "propietario_id")
    private Usuario propietario;

    // Getters y Setters
}