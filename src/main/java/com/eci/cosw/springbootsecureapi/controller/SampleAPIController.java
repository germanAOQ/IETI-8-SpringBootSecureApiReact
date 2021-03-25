package com.eci.cosw.springbootsecureapi.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api")
public class SampleAPIController
{

    @GetMapping( "/test" )
    public String getTestMessage()
    {
        return "Test Message!!";
    }
}
