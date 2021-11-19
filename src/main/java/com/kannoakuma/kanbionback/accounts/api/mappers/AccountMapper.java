package com.kannoakuma.kanbionback.accounts.api.mappers;

import com.kannoakuma.kanbionback.accounts.api.dtos.AccountDto;
import com.kannoakuma.kanbionback.accounts.model.entities.Account;

public interface AccountMapper {
    Account accountDtoToAccount(AccountDto source);

    AccountDto accountToAccountDto(Account source);
}
