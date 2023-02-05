package com.wak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wak
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "/pages/items.html";
    }
}
