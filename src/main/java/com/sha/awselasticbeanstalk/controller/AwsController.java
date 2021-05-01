package com.sha.awselasticbeanstalk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

    @GetMapping("/status")
    public String deploy(){

        return "Application is deployed on AWS BeanStalk";

    }
}
