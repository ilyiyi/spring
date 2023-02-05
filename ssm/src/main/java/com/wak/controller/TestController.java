package com.wak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wak
 */
@RestController
public class TestController {

    @GetMapping("/test/{id}")
    public String test(@PathVariable Long id) {
        return "OK: " + id;
    }
}
