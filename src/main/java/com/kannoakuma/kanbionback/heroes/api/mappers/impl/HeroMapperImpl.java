package com.kannoakuma.kanbionback.heroes.api.mappers.impl;

import com.kannoakuma.kanbionback.accounts.model.services.AccountService;
import com.kannoakuma.kanbionback.heroes.api.dtos.HeroDto;
import com.kannoakuma.kanbionback.heroes.api.mappers.HeroMapper;
import com.kannoakuma.kanbionback.heroes.model.entities.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class HeroMapperImpl implements HeroMapper {

    private AccountService accountService;

    @Autowired
    public HeroMapperImpl(AccountService accountService) {
        this.accountService = accountService;
    }
    @Override
    public HeroDto heroToHeroDto(Hero source) {
        if (source == null) {
            return null;
        }
        HeroDto heroDto = new HeroDto();
        heroDto.setId(source.getId());
        heroDto.setName(source.getName());
        heroDto.setAccountId(source.getAccount().getId());
        heroDto.setFame(source.getFame());
        return heroDto;
    }

    @Override
    public Hero heroDtoToHero(HeroDto source) {
        if(source == null) {
            return null;
        }
        Hero hero = new Hero();
        hero.setId(source.getId());
        hero.setName(source.getName());
        hero.setFame(source.getFame());
        hero.setAccount(this.accountService.findById(source.getAccountId()));
        return hero;
    }

    @Override
    public List<HeroDto> heroListToHeroListDto(List<Hero> source) {
        if(source == null) {
            return Collections.emptyList();
        }
        return source.stream().map(this::heroToHeroDto).toList();
    }
}
