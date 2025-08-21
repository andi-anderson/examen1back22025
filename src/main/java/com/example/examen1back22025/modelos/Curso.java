package com.example.examen1back22025.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre",length = 50,nullable = false,unique = false)
    private String nombre;

     public Curso() {
    }

   //Relación ManyToOne con Docente
    @ManyToOne
    @JoinColumn(name = "docente_id", nullable = false)//FK hacia Docente
    @JsonBackReference(value = "relacionDocenteCurso")
    private Docente docente;

    //Relación  ManyToMany con Usuario
    @ManyToMany(mappedBy = "cursos")
    @JsonBackReference(value = "relacionUsuarioCurso")
    private List<Usuario> usuarios = new ArrayList<>();


    public Curso(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
