package com.backendpettinaroli.portfolio.dto;

public class ProyectosDto {
    private String nombreProyecto;
    private String descripcion;
    private String urlImagen;
    private String urlProyecto;

    public ProyectosDto() {
    }

    public ProyectosDto(String nombreProyecto, String descripcion, String urlImagen, String urlProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.urlProyecto = urlProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getUrlProyecto() {
        return urlProyecto;
    }

    public void setUrlProyecto(String urlProyecto) {
        this.urlProyecto = urlProyecto;
    }
}
