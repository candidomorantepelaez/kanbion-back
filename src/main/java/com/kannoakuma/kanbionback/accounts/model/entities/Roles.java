package com.kannoakuma.kanbionback.accounts.model.entities;

import com.kannoakuma.kanbionback.accounts.model.entities.Role;

public enum Roles {
    ROLE_ADMIN(new Role("ADMIN")),
    ROLE_USER(new Role("USER"));

    private Role role;

    private Roles(Role role) {
        this.role = role;
    }

    public Role getGrantedAuthority() {
        return this.role;
    }

    public String getAuthority() {
        return this.role.getAuthority();
    }
}
