package com.kannoakuma.kanbionback.accounts.api.proxies.impl;

import com.kannoakuma.kanbionback.accounts.api.mappers.AccountMapper;
import com.kannoakuma.kanbionback.accounts.api.dtos.AccountDto;
import com.kannoakuma.kanbionback.accounts.model.entities.Account;
import com.kannoakuma.kanbionback.accounts.model.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountMapperImpl implements AccountMapper {

    @Autowired
    AccountService accountService;

    @Override
    public Account accountDtoToAccount(AccountDto source) {
        if (source == null) {
            return null;
        }
        Account account = (Account) this.accountService.loadUserByUsername(source.getUsername());
        account.setRole(source.getRole());
        return account;
    }

    @Override
    public AccountDto accountToAccountDto(Account source) {
        if (source == null) {
            return null;
        }
        return AccountDto.builder().username(source.getUsername()).role(source.getRole()).build();
    }
}
