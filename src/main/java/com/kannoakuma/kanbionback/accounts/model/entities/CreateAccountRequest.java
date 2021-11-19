package com.kannoakuma.kanbionback.accounts.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CreateAccountRequest {
    private String username;
    private String password;
}
