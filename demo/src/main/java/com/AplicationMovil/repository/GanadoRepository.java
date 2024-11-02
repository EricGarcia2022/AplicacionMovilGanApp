package com.tu_paquete.repository;

import com.tu_paquete.model.Ganado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GanadoRepository extends JpaRepository<Ganado, Long> {
    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}