package com.backendpettinaroli.portfolio.dto;

public class EstudiosDto {
    private String tituloEstudios;
    private String casaDeEstudios;
    private String fechaInicio;
    private String fechaTermino;
    private String urlLogo;

    public EstudiosDto() {
    }

    public EstudiosDto(String tituloEstudios, String casaDeEstudios, String fechaInicio, String fechaTermino, String urlLogo) {
        this.tituloEstudios = tituloEstudios;
        this.casaDeEstudios = casaDeEstudios;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.urlLogo = urlLogo;
    }

    public String getTituloEstudios() {
        return tituloEstudios;
    }

    public void setTituloEstudios(String tituloEstudios) {
        this.tituloEstudios = tituloEstudios;
    }

    public String getCasaDeEstudios() {
        return casaDeEstudios;
    }

    public void setCasaDeEstudios(String casaDeEstudios) {
        this.casaDeEstudios = casaDeEstudios;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }
}
