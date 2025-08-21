package com.example.examen1back22025.modelos;

import com.example.examen1back22025.ayudas.Especialidades;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "Docentes")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "especialidad",nullable = false,unique = false)
    @Enumerated(EnumType.STRING)
    private Especialidades especialidad;

   //Relación OneToOne con Usuario
    @OneToOne
    @JoinColumn(name = "usuario_id",nullable = false,unique = true)//FK hacia usuario
    @JsonBackReference(value = "relacionUsuarioDocente")
    private Usuario usuario;

    //Relación OneToMany con curso
    @OneToMany(mappedBy = "docente", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("relacionCursoDocente")
    private List<Curso> cursos = new ArrayList<>();



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
