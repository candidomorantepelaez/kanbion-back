package com.kannoakuma.kanbionback.heroes.ws.controllers;

import com.kannoakuma.kanbionback.heroes.api.dtos.CreateHeroRequestDto;
import com.kannoakuma.kanbionback.heroes.api.dtos.HeroDto;
import com.kannoakuma.kanbionback.heroes.api.proxies.HeroProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hero")
public class HeroController {

    private HeroProxy heroProxy;

    @Autowired
    public HeroController(HeroProxy heroProxy) {
        this.heroProxy = heroProxy;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public HeroDto getHeroById(@RequestParam Long id) {
        return this.heroProxy.getById(id);
    }

    @PostMapping
    @PreAuthorize("hasAuthority('USER')")
    public HeroDto createHero(@RequestBody CreateHeroRequestDto createHeroRequestDto) {
        return this.heroProxy.create(createHeroRequestDto);
    }
}
