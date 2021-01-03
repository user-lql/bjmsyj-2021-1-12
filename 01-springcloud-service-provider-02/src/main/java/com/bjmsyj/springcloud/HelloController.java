package com.bjmsyj.springcloud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/service/provider")
    public String hello(){
        return  "Hello 01-springcloud-service-provider ----------2";
    }

}
