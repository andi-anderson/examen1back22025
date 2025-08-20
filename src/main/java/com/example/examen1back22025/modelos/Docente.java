package com.example.examen1back22025.modelos;

import com.example.examen1back22025.ayudas.Especialidades;

public class Docente {
    private Integer id;
    private Especialidades especilidad;

    public Docente() {
    }

    public Docente(Integer id, Especialidades especilidad) {
        this.id = id;
        this.especilidad = especilidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Especialidades getEspecilidad() {
        return especilidad;
    }

    public void setEspecilidad(Especialidades especilidad) {
        this.especilidad = especilidad;
    }
}
