package com.example.exercios;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String helloWorld() {
        return  "Hello World!";
    }
}
