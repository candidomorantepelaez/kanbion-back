package com.kannoakuma.kanbionback.heroes.api.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class CreateHeroRequestDto {
    @NonNull
    private String name;
    @NonNull
    private Long accountId;
}
