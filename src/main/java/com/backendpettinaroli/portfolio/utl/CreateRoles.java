/*package com.backendpettinaroli.portfolio.utl;


import com.backendpettinaroli.portfolio.security.entity.Role;
import com.backendpettinaroli.portfolio.security.enums.RoleNombre;
import com.backendpettinaroli.portfolio.security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RoleService roleService;

    @Override
    public void run(String... args) throws Exception {
        Role roleAdmin = new Role(RoleNombre.ROLE_ADMIN);
        Role roleUser = new Role(RoleNombre.ROLE_USER);
        roleService.save(roleAdmin);
        roleService.save(roleUser);

    }
} */
