package com.kodeforyou.apps.springboot.resourcesconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

import com.kodeforyou.apps.springboot.resourcesconsumer.component.ResourceComponent;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ResourcesConsumerApplication {

	
	public static void main(String[] args) {
		System.out.println("started'");
		ApplicationContext context = SpringApplication.run(ResourcesConsumerApplication.class, args);
		/*RestTemplate restTemplate = new RestTemplate();
		
		String resourceUrl = "http://service-name:8080/api/v1/resources";
		ResponseEntity<Object[]> response = restTemplate.getForEntity(resourceUrl,Object[].class);
		Object[] dtos = response.getBody();
		
		for(Object ele:dtos) {
			System.out.println(ele.toString());
		}
		ResourceComponent rc = context.getBean("resourceComponent",ResourceComponent.class);
		
		System.out.println(rc.list());//i1
		System.out.println(rc.list());//i2
		System.out.println(rc.list());//i1
		System.out.println(rc.list());//i2
		System.out.println("ended");*/
	}

}
