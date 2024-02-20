package com.learnSpringSecurity.springSecurityCSRFandCORS.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController("/home")
public class Home {
public String home(){
    return "home";
}

}
