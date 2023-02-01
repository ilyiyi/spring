package com.wak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wak
 */
@Controller
@RequestMapping("/requestMapping")
public class RequestMappingController {
    @RequestMapping("test")
    @ResponseBody
    public String index() {
        return "ok";
    }


}
