package com.configuration.configuration.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myconfig")
public class MyAppConfig {

    private String appName;
    private String programmer;
    private String appDescription;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    @Override
    public String toString() {
        return "MyAppConfig{" +
                "appName='" + appName + '\'' +
                ", programmer='" + programmer + '\'' +
                ", appDescription='" + appDescription + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
