package com.bjmsyj.springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController<restTemplate> {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/web/hello")
    public String hello(){
        return restTemplate.getForEntity("http://01-SPRINGCLOUD-SERVICE-PROVIDER/service/provider",String.class).getBody();
    }
}
