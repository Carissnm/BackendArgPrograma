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
public class ExperienciaLaboral implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String puesto;
    private String nombreEmpresa;
    private String fechaInicio;
    private String fechaFinalizacion;
    private String descripcion;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Long id, String puesto, String nombreEmpresa, String fechaInicio, String fechaFinalizacion, String descripcion) {
        this.id = id;
        this.puesto = puesto;
        this.nombreEmpresa = nombreEmpresa;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.descripcion = descripcion;
    }


    @Override
    public String toString(){
        return "ExperienciaLaboral{" +
                "id=" + id +
                ",nombre=" + nombreEmpresa + '\'' +
                ", fecha de inicio=" + fechaInicio +  '\'' +
                ", fecha de finalizacion=" + fechaFinalizacion +  '\'' +
                ", descripcion=" + descripcion +  '\'' +
                '}';

    }
}
