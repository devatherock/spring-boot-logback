package io.github.devatherock.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
    
    @GetMapping("/hello")
    public String sayHello() {
        LOGGER.debug("Debug log in sayHello method");
        LOGGER.info("Info log in sayHello method");
        return "Hello, World!";
    }
}
