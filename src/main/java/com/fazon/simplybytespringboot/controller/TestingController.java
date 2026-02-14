package com.fazon.simplybytespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

    @GetMapping("/api/health")
    public String health() {
        return "Hello Everyone, Pipeline change pannitom";
    }

    @GetMapping("/")
    public String home() {
        return "Application is running successfully 🚀 By Roger";
    }
}
