package com.backendpettinaroli.portfolio.controller;

import com.backendpettinaroli.portfolio.entity.Persona;
import com.backendpettinaroli.portfolio.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/all")
    public ResponseEntity<List<Persona>> getAllPersonas() {
        List<Persona> personas = personaService.findAllPersonas();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable("id") Long id) {
        Persona persona = personaService.findPersonaById(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @PostMapping("/add")
    public ResponseEntity<Persona> addPersona (@RequestBody Persona persona) {
        Persona newPersona = personaService.addPersona(persona);
        return new ResponseEntity<>(newPersona, HttpStatus.CREATED);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @PutMapping("/update")
    public ResponseEntity<Persona> updatePersona (@RequestBody Persona persona) {
        Persona updatePersona = personaService.updatePersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePersona (@PathVariable("id") Long id) {
        personaService.deletePersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
