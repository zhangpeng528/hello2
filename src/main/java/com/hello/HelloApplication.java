package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloApplication {

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam (value = "str") String str){
        return "hello " +str;
    }


    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }
}
