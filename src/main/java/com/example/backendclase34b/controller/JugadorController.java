package com.example.backendclase34b.controller;

import com.example.backendclase34b.entities.Jugador;
import com.example.backendclase34b.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {
    public final JugadorService jugadorService;
    @Autowired
    public JugadorController(JugadorService jugadorService) {
        this.jugadorService = jugadorService;
    }
    @GetMapping
    public ResponseEntity<List<Jugador>> buscarJugadores(){
        return ResponseEntity.ok(jugadorService.jugadores());
    }
    @PostMapping
    public ResponseEntity<Jugador> crearJugador(@RequestBody Jugador jugador){
        return ResponseEntity.ok(jugadorService.guardarJugador(jugador));
    }
    @GetMapping("/{nombre}")
    public ResponseEntity<Jugador> buscarJugadorXNombre(@PathVariable String nombre){
        Optional<Jugador> jugadorBuscado=jugadorService.obtenerJugadorPorNombre(nombre);
        if(jugadorBuscado.isPresent()){
            return ResponseEntity.ok(jugadorBuscado.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}
