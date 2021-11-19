package com.kannoakuma.kanbionback.accounts.api.mappers;

import com.kannoakuma.kanbionback.accounts.api.dtos.CreateAccountRequestDto;
import com.kannoakuma.kanbionback.accounts.model.entities.CreateAccountRequest;

public interface CreateAccountRequestMapper {
    CreateAccountRequestDto createAccountRequestToCreateAccountRequestDto(CreateAccountRequest source);

    CreateAccountRequest createAccountRequestDtoToCreateAccountRequest(CreateAccountRequestDto source);
}

