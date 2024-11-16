package com.ashishhiggins.coursecatalogue.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(Authentication authentication) {
       Jwt jwt = (Jwt) authentication.getPrincipal();
        return "Hello, World! "+ jwt.getClaims();
    }
}
