package com.kannoakuma.kanbionback.accounts.model.repositories;

import com.kannoakuma.kanbionback.accounts.model.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findOneByUsername(String username);

}
