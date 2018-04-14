package com.home.diptam.controller;

import com.home.diptam.dto.BackendDTO;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/api")
@ConfigurationProperties(prefix = "GreetingProperties")
public class BackendGetterRestController {

    private RestTemplate restTemplate = new RestTemplate();

    private String greeting;
    private String backendServiceHost;
    private String backendServicePort;


    @RequestMapping(method = RequestMethod.GET,value = "/greetingbackend",produces = "text/plain")
    public String getBackendGreeting(){

        String backendServiceUrl = String.format("http://%s:%d/api/backend?greeting={greeting}", backendServiceHost,Integer.parseInt(backendServicePort));
        System.out.println("Url ::::::::::::::::::::::::::::::::::::::::"+backendServiceUrl);
        System.out.println("Sending to : "+backendServiceUrl);

        BackendDTO response = restTemplate.getForObject(backendServiceUrl,BackendDTO.class,greeting);

        return response.getGreeting()+" at host "+ response.getIp();
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getBackendServiceHost() {
        return backendServiceHost;
    }

    public void setBackendServiceHost(String backendServiceHost) {
        this.backendServiceHost = backendServiceHost;
    }

    public String getBackendServicePort() {
        return backendServicePort;
    }

    public void setBackendServicePort(String backendServicePort) {
        this.backendServicePort = backendServicePort;
    }
}
