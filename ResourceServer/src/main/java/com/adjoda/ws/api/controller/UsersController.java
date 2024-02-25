package com.adjoda.ws.api.controller;

import com.adjoda.ws.api.controller.response.UserRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    private final Environment env;

    @Autowired
    public UsersController(Environment env) {
        this.env = env;
    }

    @GetMapping("/status/check")
    public String status() {
        return "working on port: " + env.getProperty("local.server.port");
    }

    // @PreAuthorize("hasAuthority('ROLE_developer')")
    @PreAuthorize("hasRole('developer') or #id == #jwt.subject")
    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable String id, @AuthenticationPrincipal Jwt jwt) {
        return "Deleted user with id " + id + " and JWT subject " + jwt.getSubject();
    }

    // @PreAuthorize("hasAuthority('ROLE_developer')")

    @PostAuthorize("returnObject.userId == #jwt.subject")
    @GetMapping(path = "/{id}")
    public UserRest getUser(@PathVariable String id, @AuthenticationPrincipal Jwt jwt) {
        // return "Deleted user with id " + id + " and JWT subject " + jwt.getSubject();
        return new UserRest("Mawuli", "ADJODA", "7c22923f-c5c1-4af5-80a7-8e94438c079d");
    }
}
