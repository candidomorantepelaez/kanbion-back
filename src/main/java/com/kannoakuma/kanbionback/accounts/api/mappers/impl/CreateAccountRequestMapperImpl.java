package com.kannoakuma.kanbionback.accounts.api.mappers.impl;

import com.kannoakuma.kanbionback.accounts.api.mappers.CreateAccountRequestMapper;
import com.kannoakuma.kanbionback.accounts.api.dtos.CreateAccountRequestDto;
import com.kannoakuma.kanbionback.accounts.model.entities.CreateAccountRequest;
import org.springframework.stereotype.Service;

@Service
public class CreateAccountRequestMapperImpl implements CreateAccountRequestMapper {
    @Override
    public CreateAccountRequestDto createAccountRequestToCreateAccountRequestDto(CreateAccountRequest source) {
        if (source == null) {
            return null;
        }
        return CreateAccountRequestDto.builder().username(source.getUsername()).password(source.getPassword()).build();
    }

    @Override
    public CreateAccountRequest createAccountRequestDtoToCreateAccountRequest(CreateAccountRequestDto source) {
        if (source == null) {
            return null;
        }
        return CreateAccountRequest.builder().username(source.getUsername()).password(source.getPassword()).build();
    }
}
