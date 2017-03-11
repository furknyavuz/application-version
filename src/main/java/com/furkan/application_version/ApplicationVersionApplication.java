package com.furkan.application_version;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApplicationVersionApplication {

	private Logger logger = LoggerFactory.getLogger(ApplicationVersionApplication.class);

	@Value(value = "${application.version}")
	public String applicationVersion;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationVersionApplication.class, args);
	}

	@Bean
	public String gatherApplicationVersion() {
		logger.info("Application version: " + applicationVersion);
		return applicationVersion;
	}
}
