package com.kannoakuma.kanbionback.heroes.api.mappers;

import com.kannoakuma.kanbionback.heroes.api.dtos.HeroDto;
import com.kannoakuma.kanbionback.heroes.model.entities.Hero;

import java.util.List;

public interface HeroMapper {
    HeroDto heroToHeroDto(Hero source);
    Hero heroDtoToHero(HeroDto source);
    List<HeroDto> heroListToHeroListDto(List<Hero> source);
}
