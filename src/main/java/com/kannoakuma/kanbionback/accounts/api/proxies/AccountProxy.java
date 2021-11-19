package com.kannoakuma.kanbionback.accounts.api.proxies;

import com.kannoakuma.kanbionback.accounts.api.dtos.CreateAccountRequestDto;
import com.kannoakuma.kanbionback.accounts.api.dtos.AccountDto;

public interface AccountProxy {
    AccountDto create(CreateAccountRequestDto accountCreatedDto);
}
