package xml.com.wak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wak
 */
@Controller
public class XmlController {

    @RequestMapping("/test")
    public void test() {
        System.out.println("-----");
    }

    @RequestMapping("/login")
    public String login(String username, String password) {
        if ("wak".equals(username) && "123".equals(password)) {
            return "success";
        }
        return "fail";
    }
}
