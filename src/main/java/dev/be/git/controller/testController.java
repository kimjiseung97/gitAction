package dev.be.git.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    public ResponseEntity<Object> testController(){
        return ResponseEntity.ok().build();
    }
}
