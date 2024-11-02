package com.tu_paquete.repository;

import com.tu_paquete.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}