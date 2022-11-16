package com.example.backendclase34b.entities;

import javax.persistence.*;

@Entity
@Table(name="jugadores")
public class Jugador {
    @Id
    @SequenceGenerator(name="jugador_sequence", sequenceName = "jugador_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jugador_sequence")
    private Long id;
    private String nombre;
    private String clubFavorito;
    private String puesto;
    private int numero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tecnico_id")
    private Tecnico tecnico;

    public Jugador() {
    }

    public String getClubFavorito() {
        return clubFavorito;
    }

    public void setClubFavorito(String clubFavorito) {
        this.clubFavorito = clubFavorito;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
