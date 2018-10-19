package com.cloud.exampleserver1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestService {
    @Value("${message: Default message}")
    private String message;

    @GetMapping("/message")
    private String getMessage() {
        return message;
    }
}
