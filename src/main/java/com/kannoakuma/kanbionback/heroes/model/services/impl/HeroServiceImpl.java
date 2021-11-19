package com.kannoakuma.kanbionback.heroes.model.services.impl;

import com.kannoakuma.kanbionback.heroes.model.entities.CreateHeroRequest;
import com.kannoakuma.kanbionback.heroes.model.entities.Hero;
import com.kannoakuma.kanbionback.heroes.model.repositories.HeroRepository;
import com.kannoakuma.kanbionback.heroes.model.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {

    private final HeroRepository heroRepository;

    @Autowired
    public HeroServiceImpl(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @Override
    public Hero create(CreateHeroRequest createHeroRequest) {
        Hero hero = new Hero(createHeroRequest.getName(), createHeroRequest.getAccount());
        return this.heroRepository.save(hero);
    }

    @Override
    public Hero update(Hero hero) {
        return this.heroRepository.save(hero);
    }

    @Override
    public Hero getById(Long heroId) {
        return this.heroRepository.getById(heroId);
    }

    @Override
    public List<Hero> getAllByAccountId(Long accountId) {
        return this.heroRepository.findAllByAccountId(accountId);
    }

    @Override
    public void remove(Long heroId) {
        this.heroRepository.deleteById(heroId);
    }
}
