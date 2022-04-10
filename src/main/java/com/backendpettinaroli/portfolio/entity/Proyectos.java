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
public class Proyectos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreProyecto;
    private String descripcion;
    private String urlImagen;
    private String urlProyecto;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombreProyecto, String descripcion, String urlImagen, String urlProyecto) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.urlProyecto = urlProyecto;
    }



    @Override
    public String toString(){
        return "Proyectos {" +
                "id=" + id + '\'' +
                "Nombre=" + nombreProyecto + '\'' +
                "UrlImagen=" + urlImagen + '\'' +
                "UrlProyecto=" + urlProyecto +  '\'' +
                '}';
    }
}
