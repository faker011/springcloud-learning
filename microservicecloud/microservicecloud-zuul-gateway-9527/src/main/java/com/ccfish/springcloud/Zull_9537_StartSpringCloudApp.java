package com.ccfish.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
public class Zull_9537_StartSpringCloudApp {
	public static void main(String[] args)
	{
		SpringApplication.run(Zull_9537_StartSpringCloudApp.class, args);
	}
}
