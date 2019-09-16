package com.myapp.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

    //@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWordBean helloWorldBean(){
        return new HelloWordBean("Hello World");
    }

    @GetMapping(path="/hello-world-path-variable/{name}")
    public HelloWordBean helloWorldBean(@PathVariable String name){
        //throw new RuntimeException("Something went wrong!");
        return new HelloWordBean(String.format("Hello World, %s", name));
    }
}
