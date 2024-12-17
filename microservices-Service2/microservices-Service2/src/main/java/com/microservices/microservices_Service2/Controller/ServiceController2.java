package com.microservices.microservices_Service2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class ServiceController2 {

    @GetMapping("/service2")
    public String getServiceName2() {
        return " Hello from Service 2";
    }
}
