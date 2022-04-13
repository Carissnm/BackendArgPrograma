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

    public Role(){}

    public Role(@NotNull RoleNombre roleUser) {
        this.roleNombre = roleUser;
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
