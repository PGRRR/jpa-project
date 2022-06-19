package pgrrr.spring_boot_jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {

    @GetMapping("/")
    public String login() {
        return "index";
    }
}
