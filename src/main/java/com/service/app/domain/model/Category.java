package com.service.app.domain.model;

public class Category {
    private Long idCategory;
    private String descripcionCategory;
    private String estadoCategory;

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getDescripcionCategory() {
        return descripcionCategory;
    }

    public void setDescripcionCategory(String descripcionCategory) {
        this.descripcionCategory = descripcionCategory;
    }

    public String getEstadoCategory() {
        return estadoCategory;
    }

    public void setEstadoCategory(String estadoCategory) {
        this.estadoCategory = estadoCategory;
    }
}
