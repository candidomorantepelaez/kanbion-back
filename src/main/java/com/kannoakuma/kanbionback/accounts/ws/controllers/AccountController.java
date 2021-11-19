package com.kannoakuma.kanbionback.accounts.ws.controllers;

import com.kannoakuma.kanbionback.accounts.api.dtos.CreateAccountRequestDto;
import com.kannoakuma.kanbionback.accounts.api.dtos.AccountDto;
import com.kannoakuma.kanbionback.accounts.api.proxies.AccountProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountProxy accountProxy;

    @PostMapping
    public AccountDto createAccount(@RequestBody CreateAccountRequestDto accountCreatedDto) {
        return this.accountProxy.create(accountCreatedDto);
    }
}
