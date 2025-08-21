package com.example.examen1back22025.modelos;

import com.example.examen1back22025.ayudas.TipoUsuario;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;


@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre",length = 50,nullable = false,unique = false)
    private String nombre;

    @Column(name = "correo",length = 50,nullable = false,unique = true)
    private String correo;

    @Column(name = "contraseña",length = 50,nullable = false,unique = false)
    private String contraseña;

    @Column(name = "tipoUsuario",nullable = false,unique = false)
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

   //Relación OnetoOne con Docente
    @OneToOne(mappedBy = "usuario",cascade = CascadeType.ALL)
    @JsonManagedReference(value = "relacionDocenteUsuario")
    private Docente docente;

    //Relación ManyToMany con curso
    @ManyToMany
    @JoinTable(name = "usuario_curso",//tabla intermedia
    joinColumns = @JoinColumn(name = "usuario_id"),
    inverseJoinColumns =
    @JoinColumn(name = "curso_id"))
    @JsonManagedReference(value = "relacionCursoUsuario")
    private List<Curso> cursos = new ArrayList<>();


    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String correo, String contraseña, TipoUsuario tipoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
