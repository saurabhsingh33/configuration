package com.configuration.configuration.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {

    @Bean(name = "datasource")
    @Profile("production")
    DataSource dataSource() {
        return new DataSource("App1", 9090);
    }

    @Bean(name = "datasource")
    @Profile("development")
    DataSource datasource2() {
        return new DataSource("app2", 9091);
    }
}
