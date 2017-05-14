package com.ebac.cloud;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/index")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
