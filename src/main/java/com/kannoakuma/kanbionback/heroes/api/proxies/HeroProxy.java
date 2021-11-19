package com.kannoakuma.kanbionback.heroes.api.proxies;

import com.kannoakuma.kanbionback.heroes.api.dtos.CreateHeroRequestDto;
import com.kannoakuma.kanbionback.heroes.api.dtos.HeroDto;

import java.util.List;

public interface HeroProxy {
    HeroDto create(CreateHeroRequestDto createHeroRequestDto);
    HeroDto update(HeroDto heroDto);
    HeroDto getById(Long heroId);
    List<HeroDto> getAllByAccountId(Long accountId);
    void remove(Long heroId);
}
