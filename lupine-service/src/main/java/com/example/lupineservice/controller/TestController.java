package com.example.lupineservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/lupine-service/test")
public class TestController {
    @GetMapping("/hello-world")
    public ResponseEntity<?> helloWorld() {
        String result = "Hello World";

        return ResponseEntity.ok(result);
    }

}
