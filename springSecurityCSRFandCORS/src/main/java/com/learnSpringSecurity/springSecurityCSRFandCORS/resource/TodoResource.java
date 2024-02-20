package com.learnSpringSecurity.springSecurityCSRFandCORS.resource;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {
    record Todo (String username, String Desc){}

    @GetMapping("/todo")
    public List<Todo> todo(@RequestBody Todo todo) {
        return List.of(new Todo("acde","this is what needed"));
    }
}
