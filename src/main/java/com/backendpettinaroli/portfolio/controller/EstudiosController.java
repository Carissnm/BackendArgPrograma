package com.backendpettinaroli.portfolio.controller;


import com.backendpettinaroli.portfolio.entity.Estudios;
import com.backendpettinaroli.portfolio.service.EstudiosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/estudios")
public class EstudiosController {
    private final EstudiosService estudiosService;

    public EstudiosController(EstudiosService estudiosService){
        this.estudiosService = estudiosService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Estudios>> getAllEstudios() {
        List<Estudios> estudios = estudiosService.findAllEstudios();
        return new ResponseEntity<>(estudios, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Estudios> getEstudiosById(@PathVariable("id") Long id) {
        Estudios estudio = estudiosService.findEstudiosById(id);
        return new ResponseEntity<>(estudio, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Estudios> addEstudio (@RequestBody Estudios estudio) {
        Estudios newEstudio = estudiosService.addEstudio(estudio);
        return new ResponseEntity<>(newEstudio, HttpStatus.CREATED);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Estudios> updateEstudio (@RequestBody Estudios estudio) {
        Estudios updateEstudios = estudiosService.updateEstudios(estudio);
        return new ResponseEntity<>(updateEstudios, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEstudio (@PathVariable("id") Long id) {
        estudiosService.deleteEstudios(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
