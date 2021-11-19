package com.kannoakuma.kanbionback.heroes.api.mappers;

import com.kannoakuma.kanbionback.heroes.api.dtos.CreateHeroRequestDto;
import com.kannoakuma.kanbionback.heroes.model.entities.CreateHeroRequest;

public interface CreateHeroRequestMapper {
    CreateHeroRequest createHeroRequestDtoToCreateHeroRequest(CreateHeroRequestDto source);
    CreateHeroRequestDto createHeroRequestToCreateHeroRequestDto(CreateHeroRequest source);
}
