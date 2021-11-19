package com.kannoakuma.kanbionback.heroes.api.mappers.impl;

import com.kannoakuma.kanbionback.accounts.model.services.AccountService;
import com.kannoakuma.kanbionback.heroes.api.dtos.CreateHeroRequestDto;
import com.kannoakuma.kanbionback.heroes.api.mappers.CreateHeroRequestMapper;
import com.kannoakuma.kanbionback.heroes.model.entities.CreateHeroRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateHeroRequestMapperImpl implements CreateHeroRequestMapper {

    private AccountService accountService;

    @Autowired
    public CreateHeroRequestMapperImpl(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public CreateHeroRequest createHeroRequestDtoToCreateHeroRequest(CreateHeroRequestDto source) {
        if (source == null) {
            return null;
        }
        CreateHeroRequest createHeroRequest = new CreateHeroRequest();
        createHeroRequest.setName(source.getName());
        createHeroRequest.setAccount(this.accountService.findById(source.getAccountId()));
        return createHeroRequest;
    }

    @Override
    public CreateHeroRequestDto createHeroRequestToCreateHeroRequestDto(CreateHeroRequest source) {
        if (source == null) {
            return null;
        }
        CreateHeroRequestDto createHeroRequestDto = new CreateHeroRequestDto();
        createHeroRequestDto.setName(source.getName());
        createHeroRequestDto.setAccountId(source.getAccount().getId());
        return createHeroRequestDto;
    }
}
