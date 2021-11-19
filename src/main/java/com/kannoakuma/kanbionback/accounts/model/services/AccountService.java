package com.kannoakuma.kanbionback.accounts.model.services;

import com.kannoakuma.kanbionback.accounts.model.entities.Account;
import com.kannoakuma.kanbionback.accounts.model.entities.CreateAccountRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AccountService extends UserDetailsService {
    Account create(CreateAccountRequest accountCreated);
    Account findById(Long id);
}
