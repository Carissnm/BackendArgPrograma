package com.backendpettinaroli.portfolio.service;

import com.backendpettinaroli.portfolio.entity.Estudios;
import com.backendpettinaroli.portfolio.exception.UserNotFoundException;
import com.backendpettinaroli.portfolio.repository.EstudiosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EstudiosService {
    private final EstudiosRepository estudiosRepo;

    @Autowired
    public EstudiosService(EstudiosRepository estudiosRepo) {
        this.estudiosRepo = estudiosRepo;
    }

    public Estudios addEstudio(Estudios estudio) {
        return estudiosRepo.save(estudio);
    }

    public List<Estudios> findAllEstudios() {
        return estudiosRepo.findAll();
    }

    public Estudios updateEstudios(Estudios estudio) {
        return estudiosRepo.save(estudio);
    }

    public void deleteEstudios(Long id) {
        estudiosRepo.deleteEstudiosById(id);
    }


    public Estudios findEstudiosById(Long id) {
        return estudiosRepo.findEstudiosById(id).orElseThrow(() -> new UserNotFoundException("El curso de id" + id + "no fue encontrado"));
    }
}
