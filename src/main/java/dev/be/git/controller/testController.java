package dev.be.git.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping
    public ResponseEntity<Object> testController(){
        return ResponseEntity.ok().body("hello");
    }

    @GetMapping("/hello")
    public ResponseEntity<?> helloController(){
        return ResponseEntity.ok().body("test");
    }
}
