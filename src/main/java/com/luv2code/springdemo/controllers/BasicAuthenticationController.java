package com.luv2code.springdemo.controllers;

import com.luv2code.springdemo.entity.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BasicAuthenticationController {

    @GetMapping("/basicauth")
    public AuthenticationBean getAuth() {
        return new AuthenticationBean("You are authenticated");
    }
}
