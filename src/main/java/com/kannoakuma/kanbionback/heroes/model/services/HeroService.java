package com.kannoakuma.kanbionback.heroes.model.services;

import com.kannoakuma.kanbionback.heroes.model.entities.CreateHeroRequest;
import com.kannoakuma.kanbionback.heroes.model.entities.Hero;

import java.util.List;

public interface HeroService {
    Hero create(CreateHeroRequest createHeroRequest);
    Hero update(Hero hero);
    Hero getById(Long heroId);
    List<Hero> getAllByAccountId(Long accountId);
    void remove(Long heroId);
}
