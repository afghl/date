package com.afghl.restaurant.facade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldFacade {

    @RequestMapping(path = "/helloworld")
    public String helloworld() {
        return "hello world";
    }
}
