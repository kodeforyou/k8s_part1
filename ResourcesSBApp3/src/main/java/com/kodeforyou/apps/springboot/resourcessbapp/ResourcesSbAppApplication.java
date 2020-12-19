package com.kodeforyou.apps.springboot.resourcessbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.kodeforyou.apps")
@EnableJpaRepositories
//@EnableDiscoveryClient
public class ResourcesSbAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ResourcesSbAppApplication.class, args);
	}

}
