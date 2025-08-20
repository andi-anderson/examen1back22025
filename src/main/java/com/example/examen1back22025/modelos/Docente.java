package com.example.examen1back22025.modelos;

import com.example.examen1back22025.ayudas.Especialidades;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "Docentes")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "especialidad",nullable = false,unique = false)
    @Enumerated(EnumType.STRING)
    private Especialidades especialidad;

    public Docente() {
    }

    public Docente(Integer id, Especialidades especialidad) {
        this.id = id;
        this.especialidad = especialidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Especialidades getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidades especialidad) {
        this.especialidad = especialidad;
    }
}
