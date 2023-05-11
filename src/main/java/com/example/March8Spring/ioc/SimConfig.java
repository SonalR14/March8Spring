package com.example.March8Spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//make object factory of Bean
//Bean - is java objects
//context reference variable
//getBean(Jio.class)- object of that class
//scanning - class path scanning create class object
//Configuration - when app run its create object
//scope -single term prototype
//netstat -ano
@Configuration
public class SimConfig {
    @Bean
    public Jio getJio(){
        return new Jio();
    }
}
