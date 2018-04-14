package com.home.diptam.controller;


import com.home.diptam.model.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/api")
@ConfigurationProperties(prefix = "ApplicationProperties")
public class MicroRestController {

    private String greeting;

    @RequestMapping(method = RequestMethod.GET,value = "/gethost",produces = "text/xml")
    public User getHostAddress(@RequestParam(value = "fname",required = false) String firstName
                                ,@RequestParam(value = "lname",required = false) String lastName) throws UnknownHostException{

        String hostName = null;
        try {
            hostName = InetAddress.getLocalHost().getHostAddress();
        }catch (UnknownHostException e){
            hostName ="Unknown";
        }
        //return "Hello "+firstName+" "+lastName+" You host is "+hostName;

        User user = new User(firstName,lastName,"Developer", hostName);
        return user;
    }

    public String getGreeting() {
        return greeting;
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

}
