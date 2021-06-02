package com.example.personaBackend.model;

import javax.persistence.*;

@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /* Una persona solo puede tener un país, mientras que un país puede tener varias personas */
    @ManyToOne
    @JoinColumn(name="id_pais")
    private Pais pais;
    private String nombre;

    /* Constructor vacío */
    public Estado() {
    }

    public Estado(Pais pais, String nombre) {
        super();
        this.pais = pais;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
