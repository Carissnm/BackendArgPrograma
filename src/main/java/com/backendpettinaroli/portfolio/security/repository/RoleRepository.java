package com.backendpettinaroli.portfolio.security.repository;

import com.backendpettinaroli.portfolio.security.entity.Role;
import com.backendpettinaroli.portfolio.security.enums.RoleNombre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleNombre(RoleNombre roleNombre);
}
