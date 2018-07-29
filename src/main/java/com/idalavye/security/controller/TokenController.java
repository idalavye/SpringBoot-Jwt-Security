package com.idalavye.security.controller;

import com.idalavye.security.model.JwtUser;
import com.idalavye.security.security.JwtGenerator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final JwtUser jwtUser){

        return jwtGenerator.generate(jwtUser);
    }
}
