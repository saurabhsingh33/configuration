package com.configuration.configuration.controller;

import com.configuration.configuration.service.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @Value("${myconfig.appName}")
    private String appName;

    @Value("${config2.appName}")
    private String secondApp;


    @RequestMapping("app1")
    public String appName() {
        return appName;
    }

    @RequestMapping("app2")
    public String getSecondApp() {
        return secondApp;
    }

    @RequestMapping("server")
    public String getserver() {
        return new DataSource("my server", 2020).toString();
    }
}
