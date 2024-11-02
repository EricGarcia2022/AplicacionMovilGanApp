package com.tu_paquete.model;

import javax.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    // Getters y Setters
}

public class Usuario{
    public static void main (String[] args){
        System.out.print(x:"Hola mundo");
    }
}