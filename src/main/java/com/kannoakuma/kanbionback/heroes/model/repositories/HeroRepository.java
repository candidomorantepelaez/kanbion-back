package com.kannoakuma.kanbionback.heroes.model.repositories;

import com.kannoakuma.kanbionback.heroes.model.entities.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HeroRepository extends JpaRepository<Hero, Long> {
    Hero findOneByName(String name);
    List<Hero> findAllByAccountId(Long accountId);
}
