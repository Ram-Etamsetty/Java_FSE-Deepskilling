package com.example.jwtauth.controller;

import com.example.jwtauth.model.TokenResponse;
import com.example.jwtauth.util.JwtUtil;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @GetMapping("/authenticate")
    public TokenResponse authenticate(Authentication authentication) {

        String username = authentication.getName();

        String token = JwtUtil.generateToken(username);

        return new TokenResponse(token);

    }
}
