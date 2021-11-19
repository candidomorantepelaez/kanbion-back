package com.kannoakuma.kanbionback.accounts.api.proxies.impl;

import com.kannoakuma.kanbionback.accounts.api.proxies.AccountProxy;
import com.kannoakuma.kanbionback.accounts.api.dtos.CreateAccountRequestDto;
import com.kannoakuma.kanbionback.accounts.api.dtos.AccountDto;
import com.kannoakuma.kanbionback.accounts.api.mappers.CreateAccountRequestMapper;
import com.kannoakuma.kanbionback.accounts.api.mappers.AccountMapper;
import com.kannoakuma.kanbionback.accounts.model.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountProxyImpl implements AccountProxy {

    @Autowired
    AccountService accountService;

    @Autowired
    AccountMapper accountMapper;

    @Autowired
    CreateAccountRequestMapper accountCreatedMapper;

    @Override
    public AccountDto create(CreateAccountRequestDto accountCreatedDto) {
        return this.accountMapper.accountToAccountDto(this.accountService
                .create(this.accountCreatedMapper
                        .createAccountRequestDtoToCreateAccountRequest(
                                accountCreatedDto)));
    }
}
