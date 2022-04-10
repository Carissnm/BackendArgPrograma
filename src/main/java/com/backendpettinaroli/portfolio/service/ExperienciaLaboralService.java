package com.backendpettinaroli.portfolio.service;

import com.backendpettinaroli.portfolio.entity.ExperienciaLaboral;
import com.backendpettinaroli.portfolio.exception.UserNotFoundException;
import com.backendpettinaroli.portfolio.repository.ExperienciaLaboralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ExperienciaLaboralService {
    private final ExperienciaLaboralRepository experienciaLaboralRepo;

    @Autowired
    public ExperienciaLaboralService (ExperienciaLaboralRepository experienciaLaboralRepo){
        this.experienciaLaboralRepo = experienciaLaboralRepo;
    }

    public ExperienciaLaboral addExperienciaLaboral(ExperienciaLaboral experienciaLaboral){
        return experienciaLaboralRepo.save(experienciaLaboral);
    }

    public List<ExperienciaLaboral> findAllExperienciaLaboral() {
        return experienciaLaboralRepo.findAll();
    }

    public ExperienciaLaboral findExperienciaLaboral(Long id){
        return experienciaLaboralRepo.findExperienciaLaboralById(id)
                .orElseThrow(() -> new UserNotFoundException("La experiencia laboral de id" + id + "no fue encontrada"));
    }

    public ExperienciaLaboral updateExperienciaLaboral(ExperienciaLaboral experienciaLaboral){
        return experienciaLaboralRepo.save(experienciaLaboral);
    }

    public void deleteExperienciaLaboral(Long id){
        experienciaLaboralRepo.deleteExperienciaLaboralById(id);
    }
}
