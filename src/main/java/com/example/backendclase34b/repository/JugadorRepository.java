package com.example.backendclase34b.repository;

import com.example.backendclase34b.entities.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface JugadorRepository extends JpaRepository<Jugador,Long> {
    //para crear -> save
    //para obtener lista -> findAll
    // para obtener un jugador por nombre ->

    @Query("select j from Jugador j where j.nombre=?1")
    Optional<Jugador> buscarJugadorPorNombre (String nombre);
}
