package com.backendpettinaroli.portfolio.repository;


import com.backendpettinaroli.portfolio.entity.Estudios;
import com.backendpettinaroli.portfolio.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstudiosRepository extends JpaRepository<Estudios, Long> {
    void deleteEstudiosById(Long id);

    Optional<Estudios> findEstudiosById(Long id);
}
