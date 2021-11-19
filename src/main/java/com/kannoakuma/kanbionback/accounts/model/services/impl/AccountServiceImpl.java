package com.kannoakuma.kanbionback.accounts.model.services.impl;

import com.kannoakuma.kanbionback.accounts.model.entities.Account;
import com.kannoakuma.kanbionback.accounts.model.entities.CreateAccountRequest;
import com.kannoakuma.kanbionback.accounts.model.entities.Roles;
import com.kannoakuma.kanbionback.accounts.model.repositories.AccountRepository;
import com.kannoakuma.kanbionback.accounts.model.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return this.accountRepository.findOneByUsername(s);
    }

    @Override
    public Account create(CreateAccountRequest accountCreated) {
        return this.accountRepository.save(
                new Account(
                        accountCreated.getUsername(),
                        this.bCryptPasswordEncoder.encode(accountCreated.getPassword()),
                        Roles.ROLE_USER.getGrantedAuthority()));
    }

    @Override
    public Account findById(Long id) {
        return this.accountRepository.getById(id);
    }
}
