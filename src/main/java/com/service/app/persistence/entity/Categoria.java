package com.service.app.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias", schema = "sistema")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {return estado;}

    public void setEstado(String estado){ this.estado = estado;}

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
