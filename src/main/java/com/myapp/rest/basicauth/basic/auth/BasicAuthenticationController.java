package com.myapp.rest.basicauth.basic.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin("http://localhost:4200")
@Controller
public class BasicAuthenticationController {

    @GetMapping(path = "/basicauth")
    public @ResponseBody AuthenticationBean AuthenticationBean(){
        return new AuthenticationBean("You are authenticated!");
    }
}
