package com.example.backenddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/api/hello")
    public Map<String, String> hello() {
        return Map.of(
                "service", "backend",
                "message", "Hello again from backend 🚀"
        );
    }
}
