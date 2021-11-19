package com.kannoakuma.kanbionback.heroes.model.entities;

import com.kannoakuma.kanbionback.accounts.model.entities.Account;
import lombok.*;

@Data
@NoArgsConstructor
public class CreateHeroRequest {
    private String name;
    private Account account;
}
