package com.kannoakuma.kanbionback.heroes.model.entities;

import com.kannoakuma.kanbionback.accounts.model.entities.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Hero implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;

    @Column(unique=true, nullable = false)
    private String name;

    @Column(nullable = false)
    private Long fame;

    public Hero(String name, Account account) {
        this.name = name;
        this.account = account;
        this.fame = 0L;
    }

}
