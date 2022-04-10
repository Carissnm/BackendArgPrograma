package com.backendpettinaroli.portfolio.repository;


import com.backendpettinaroli.portfolio.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long> {
    void deleteSkillById(Long id);

    Optional<Skills> findSkillById(Long id);
}
