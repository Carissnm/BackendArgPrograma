package com.backendpettinaroli.portfolio.service;


import com.backendpettinaroli.portfolio.entity.Proyectos;
import com.backendpettinaroli.portfolio.exception.UserNotFoundException;
import com.backendpettinaroli.portfolio.repository.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProyectosService {
    private final ProyectosRepository proyectosRepo;

    @Autowired
    public ProyectosService(ProyectosRepository proyectosRepo) {
        this.proyectosRepo = proyectosRepo;
    }

    public Proyectos addProyecto(Proyectos proyecto) {
        return proyectosRepo.save(proyecto);
    }

    public List<Proyectos> findAllProyectos() {
        return proyectosRepo.findAll();
    }

    public Proyectos updateProyectos(Proyectos proyecto) {
        return proyectosRepo.save(proyecto);
    }

    public void deleteProyecto(Long id) {
        proyectosRepo.deleteProyectoById(id);
    }


    public Proyectos findProyecto(Long id) {
        return proyectosRepo.findProyectoById(id).orElseThrow(() -> new UserNotFoundException("El proyecto de id" + id + "no fue encontrado"));
    }
}
