package com.backendpettinaroli.portfolio.security.service;

import com.backendpettinaroli.portfolio.security.entity.Role;
import com.backendpettinaroli.portfolio.security.enums.RoleNombre;
import com.backendpettinaroli.portfolio.security.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public Optional<Role> getByRoleNombre(RoleNombre rolenombre){
        return roleRepository.findByRoleNombre(rolenombre);
    }

    public void save(Role role){
        roleRepository.save(role);
    }
}
