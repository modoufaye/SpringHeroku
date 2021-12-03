package org.sid2.springheroku.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping(value = "login")
    public String connect(){
        return "/login";
    }

    @GetMapping(value = "/")
    public String index(){
        return "/login";
    }

}
