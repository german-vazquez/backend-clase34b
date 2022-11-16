package com.example.backendclase34b.service;

import com.example.backendclase34b.entities.Jugador;
import com.example.backendclase34b.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class JugadorService {

    private final JugadorRepository jugadorRepository;
    @Autowired
    public JugadorService(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }
    public Jugador guardarJugador(Jugador jugador){
        return jugadorRepository.save(jugador);
    }
    public List<Jugador> jugadores(){
        return jugadorRepository.findAll();
    }
    public Optional<Jugador> obtenerJugadorPorNombre(String nombre){
        return jugadorRepository.buscarJugadorPorNombre(nombre);
    }
}
