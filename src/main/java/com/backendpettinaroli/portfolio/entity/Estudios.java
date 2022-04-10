package com.backendpettinaroli.portfolio.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Getter
@Setter
public class Estudios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tituloEstudios;
    private String casaDeEstudios;
    private String fechaInicio;
    private String fechaTermino;
    private String urlLogo;

    public Estudios() {
    }

    public Estudios(Long id, String tituloEstudios, String casaDeEstudios, String fechaInicio, String fechaTermino, String urlLogo) {
        this.id = id;
        this.tituloEstudios = tituloEstudios;
        this.casaDeEstudios = casaDeEstudios;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.urlLogo = urlLogo;
    }

    @Override
    public String toString(){
        return "Estudio {" +
                "id=" + id +
                ", titulo='" + tituloEstudios + '\'' +
                ", institucion=" + casaDeEstudios + '\'' +
                ", fecha de inicio=" + fechaInicio + '\'' +
                ", fecha de finalizacion=" + fechaTermino + '\'' +
                ", logo de la institucion=" + urlLogo + '\'' +
                '}';
    }
}
