package com.example.jenkins.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsTest {

    @GetMapping
    public String getJenkingsData() {
        return "Welcome to the Jenkins demo Page";
    }
}
