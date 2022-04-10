package com.backendpettinaroli.portfolio.dto;

public class SkillsDto {
    private String skill;
    private String porcentaje;

    public SkillsDto() {
    }

    public SkillsDto(String skill, String porcentaje) {
        this.skill = skill;
        this.porcentaje = porcentaje;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
}
