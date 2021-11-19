package com.kannoakuma.kanbionback.accounts.models;

public interface AccountRepository {

    Account findOneByUsername(String username);

}
