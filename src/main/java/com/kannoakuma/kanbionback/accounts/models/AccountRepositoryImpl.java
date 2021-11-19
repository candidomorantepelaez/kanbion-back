package com.kannoakuma.kanbionback.accounts.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class AccountRepositoryImpl implements AccountRepository {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Account findOneByUsername(String username) {
        for(Account account: this.getAccounts()) {
            if(username.equals(account.getUsername())) {
                return account;
            }
        }
        return null;
    }

    private List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(this.createAccount("candido", "Temporal18@"));
        return accounts;
    }

    private Account createAccount(String username, String password) {
        Collection<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority("USER"));
        return new Account(username, this.passwordEncoder.encode(password), roles, true, true, true, true);
    }
}
