package com.kannoakuma.kanbionback.accounts.api.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateAccountRequestDto {
    @NonNull
    private String username;
    @NonNull
    private String password;
}
