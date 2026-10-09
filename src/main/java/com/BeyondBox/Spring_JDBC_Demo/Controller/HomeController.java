package com.BeyondBox.Spring_JDBC_Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String HomeController()
    {
        return "Welcome to Spring Boot JDBC Demo";

    }

}
