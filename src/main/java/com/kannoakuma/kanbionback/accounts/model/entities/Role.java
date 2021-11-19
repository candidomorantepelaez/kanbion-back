package com.kannoakuma.kanbionback.accounts.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Role implements GrantedAuthority, Serializable {

    private String name;

    @Override
    public String getAuthority() {
        return this.name;
    }
}
