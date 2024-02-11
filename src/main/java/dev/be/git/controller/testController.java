package dev.be.git.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping
    public ResponseEntity<Object> testController(){
        return ResponseEntity.ok().body("test");
    }

    @GetMapping("/hello")
    public ResponseEntity<?> helloController(){
        return ResponseEntity.ok().body("hello 자동배포 테스트입니다");
    }

    @GetMapping("/hello2")
    public ResponseEntity<?> hello2Controller(){
        return ResponseEntity.ok().body("hello2 자동반영되나요?.");
    }
}
