package com.tu_paquete.controller;

import com.tu_paquete.model.Ganado;
import com.tu_paquete.repository.GanadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GanadoController {

    @Autowired
    private GanadoRepository ganadoRepository;

    @PostMapping("/ganado")
    public ResponseEntity<Ganado> agregarGanado(@RequestBody Ganado ganado) {
        Ganado nuevoGanado = ganadoRepository.save(ganado);
        return ResponseEntity.ok(nuevoGanado);
    }
}

// GanadoController.java
@RestController
@RequestMapping("/api")
public class GanadoController {
    
    @Autowired
    private GanadoRepository ganadoRepository;
    
    @GetMapping("/ganado")
    public List<Ganado> obtenerGanado() {
        return ganadoRepository.findAll();
    }
    
    @GetMapping("/ganado/{id}")
    public Ganado obtenerGanadoPorId(@PathVariable Long id) {
        return ganadoRepository.findById(id).orElseThrow();
    }
    
    @PostMapping("/ganado")
    public Ganado crearGanado(@RequestBody Ganado ganado) {
        return ganadoRepository.save(ganado);
    }
    
    @PutMapping("/ganado/{id}")
    public Ganado actualizarGanado(@PathVariable Long id, @RequestBody Ganado ganado) {
        Ganado ganadoExistente = ganadoRepository.findById(id).orElseThrow();
        ganadoExistente.setTipo(ganado.getTipo());
        ganadoExistente.setRaza(ganado.getRaza());
        return ganadoRepository.save(ganadoExistente);
    }
    
    @DeleteMapping("/ganado/{id}")
    public void eliminarGanado(@PathVariable Long id) {
        ganadoRepository.deleteById(id);
    }
}