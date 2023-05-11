package com.example.March8Spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //automatic object created
@Scope(value = "prototype")
public class Student1 {
    @Autowired
    private Subject subject;
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    public Student1(){
        System.out.println("in const");
    }
    public void callSubject(){
        subject.getSubject();
    }
}
