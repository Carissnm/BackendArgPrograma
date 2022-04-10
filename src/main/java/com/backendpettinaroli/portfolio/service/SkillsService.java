package com.backendpettinaroli.portfolio.service;


import com.backendpettinaroli.portfolio.entity.Skills;
import com.backendpettinaroli.portfolio.exception.UserNotFoundException;
import com.backendpettinaroli.portfolio.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SkillsService {

    private final SkillsRepository skillsRepo;

    @Autowired
    public SkillsService(SkillsRepository skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    public Skills addSkill(Skills skill) {
        return skillsRepo.save(skill);
    }

    public List<Skills> findAllSkills() {
        return skillsRepo.findAll();
    }

    public Skills updateSkills(Skills skill) {
        return skillsRepo.save(skill);
    }

    public void deleteSkill(Long id) {
        skillsRepo.deleteSkillById(id);
    }


    public Skills findSkillById(Long id) {
        return skillsRepo.findSkillById(id).orElseThrow(() -> new UserNotFoundException("La habilidad de id" + id + "no fue encontrada"));
    }
}
