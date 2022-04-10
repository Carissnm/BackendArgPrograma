package com.backendpettinaroli.portfolio.controller;


import com.backendpettinaroli.portfolio.entity.Skills;
import com.backendpettinaroli.portfolio.service.SkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService){
        this.skillsService = skillsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Skills>> findAllSkills() {
        List<Skills> skills = skillsService.findAllSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Skills> findSkillsById(@PathVariable("id") Long id) {
        Skills skills = skillsService.findSkillById(id);
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Skills> addSkill (@RequestBody Skills skill) {
        Skills newSkill = skillsService.addSkill(skill);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Skills> updateSkills (@RequestBody Skills skill) {
        Skills updateSkills = skillsService.updateSkills(skill);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSkill (@PathVariable("id") Long id) {
        skillsService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
