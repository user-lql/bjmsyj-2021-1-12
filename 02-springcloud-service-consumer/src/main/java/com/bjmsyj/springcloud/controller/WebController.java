package com.bjmsyj.springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController<restTemplate> {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/web/hello")
    public String hello(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://01-SPRINGCLOUD-SERVICE-PROVIDER/service/provider",String.class);
        System.out.println(responseEntity.getBody());//body内容
        System.out.println(responseEntity.getStatusCode());//信息码 -如：200 OK
        System.out.println(responseEntity.getStatusCodeValue());//信息码值 如：200
        System.out.println(responseEntity.getHeaders());//网页head信息如：[Content-Type:"text/plain;charset=UTF-8", Content-Length:"37", Date:"Mon, 11 Jan 2021 12:15:48 GMT"]
        System.out.println(responseEntity.getClass());//获得responseEntity类 如：class org.springframework.http.ResponseEntity
        return restTemplate.getForEntity("http://01-SPRINGCLOUD-SERVICE-PROVIDER/service/provider",String.class).getBody();
    }
}
