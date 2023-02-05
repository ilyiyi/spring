package com.wak.controller;

import com.wak.domain.User;
import com.wak.repsonse.ResultResponse;
import com.wak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author wak
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(String account, String password, HttpSession session) {
        try {
            User user = userService.login(account, password);
            if (user != null) {
                session.setAttribute("user", user);
                return "redirect:/pages/product.html";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/pages/login.html";
    }

    /**
     * 判断账号是否已存在
     *
     * @return 结果集
     */
    @GetMapping("/register")
    @ResponseBody
    public ResultResponse exist(String account) {
        ResultResponse resp;
        try {
            boolean result = userService.checkAccount(account);
            resp = new ResultResponse().put(result);
        } catch (Exception e) {
            e.printStackTrace();
            resp = new ResultResponse(e.getClass().getSimpleName(), e.getMessage());
        }
        return resp;
    }

    @PostMapping("/register")
    public String register(String account, String password) {
        try {
            int i = userService.register(account, password);
            if (i > 0) {
                return "redirect:/pages/login.html";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/pages/register.html";
    }


}
