package com.kannoakuma.kanbionback.heroes.api.proxies.impl;

import com.kannoakuma.kanbionback.heroes.api.dtos.CreateHeroRequestDto;
import com.kannoakuma.kanbionback.heroes.api.dtos.HeroDto;
import com.kannoakuma.kanbionback.heroes.api.mappers.HeroMapper;
import com.kannoakuma.kanbionback.heroes.api.mappers.CreateHeroRequestMapper;
import com.kannoakuma.kanbionback.heroes.api.proxies.HeroProxy;
import com.kannoakuma.kanbionback.heroes.model.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroProxyImpl implements HeroProxy {

    private HeroMapper heroMapper;

    private CreateHeroRequestMapper createHeroRequestMapper;

    private HeroService heroService;

    @Autowired
    public HeroProxyImpl(HeroMapper heroMapper, HeroService heroService, CreateHeroRequestMapper createHeroRequestMapper) {
        this.heroMapper = heroMapper;
        this.heroService = heroService;
        this.createHeroRequestMapper = createHeroRequestMapper;
    }

    @Override
    public HeroDto create(CreateHeroRequestDto createHeroRequestDto) {
        return this.heroMapper.heroToHeroDto(
                this.heroService.create(
                        this.createHeroRequestMapper.createHeroRequestDtoToCreateHeroRequest(createHeroRequestDto)));
    }

    @Override
    public HeroDto update(HeroDto heroDto) {
        return this.heroMapper.heroToHeroDto(
                this.heroService.update(
                        this.heroMapper.heroDtoToHero(heroDto)));
    }

    @Override
    public HeroDto getById(Long heroId) {
        return this.heroMapper.heroToHeroDto(this.heroService.getById(heroId));
    }

    @Override
    public List<HeroDto> getAllByAccountId(Long accountId) {
        return this.heroMapper.heroListToHeroListDto(this.heroService.getAllByAccountId(accountId));
    }

    @Override
    public void remove(Long heroId) {
        this.heroService.remove(heroId);
    }
}
