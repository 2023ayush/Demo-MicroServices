package com.microservices.Controller;

import com.microservices.Configuration.RestTemplateConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/services")
public class ServiceController1 {

    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/service1")
    public String service1() {
        String Service2url = "http://microservices-Service2/get/service2";
          return restTemplate.getForObject(Service2url, String.class);
    }
}
