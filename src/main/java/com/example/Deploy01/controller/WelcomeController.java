package com.example.Deploy01.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @Value("${devName}")
    private String devName;

    @GetMapping
    public ResponseEntity<String> getDevNam() {
        return ResponseEntity.ok("DevName: " + devName);
    }
}
