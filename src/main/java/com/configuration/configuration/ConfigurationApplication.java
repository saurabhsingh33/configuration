package com.configuration.configuration;

import com.configuration.configuration.service.MyAppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class ConfigurationApplication {
	private static final Logger logger = LoggerFactory.getLogger(ConfigurationApplication.class);
	public static void main(String[] args) {

		try {
			ApplicationContext ctx = SpringApplication.run(ConfigurationApplication.class, args);
			//System.out.println(ctx.getBean(MyAppConfig.class).toString());
			logger.info(ctx.getBean(ConfigurationApplication.class).toString());
			logger.info(ctx.getBean("datasource").toString());
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

}
