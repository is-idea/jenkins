package com.example.jenkinsexample;

import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsExampleApplication.class, args);
    }


    @GetMapping("/")
    public String test(){
        return "SUCCESS!!!";
    }

}
