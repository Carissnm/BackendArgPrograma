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
public class Skills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String skill;
    private String porcentaje;

    public Skills() {
    }

    public Skills(Long id, String skill, String porcentaje) {
        this.id = id;
        this.skill = skill;
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString(){
        return "Skills {" +
                "id=" + id + '\'' +
                "Skill=" + skill + '\'' +
                "Porcentaje=" + porcentaje + '\'' +
                '}';
    }
}
