package com.wak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wak
 */
@Controller
@RequestMapping("/path")
public class PathController {
    @RequestMapping("/test/{id}")
    @ResponseBody
    public String test(@PathVariable("id") String name) {
        System.out.println(name);
        return "OK";
    }
}
