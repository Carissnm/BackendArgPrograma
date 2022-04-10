package com.backendpettinaroli.portfolio.security.entity;

import com.backendpettinaroli.portfolio.security.enums.RoleNombre;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RoleNombre roleNombre;

    public Role(RoleNombre roleUser) {
    }

    public Role(Long id, RoleNombre roleNombre) {
        this.id = id;
        this.roleNombre = roleNombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleNombre getRoleNombre() {
        return roleNombre;
    }

    public void setRoleNombre(RoleNombre roleNombre) {
        this.roleNombre = roleNombre;
    }
}
