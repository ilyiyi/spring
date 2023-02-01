package com.wak.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wak
 */
@RestController
public class TestRestController {
    @RequestMapping("/rest")
    public String testTest() {
        return "ok";
    }

    @RequestMapping("/student/getById")
    public String getById(Long id) {
        System.out.println(id);
        return "ok";
    }
}
