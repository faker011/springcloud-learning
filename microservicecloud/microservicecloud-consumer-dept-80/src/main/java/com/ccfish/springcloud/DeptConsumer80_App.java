package com.ccfish.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
@EnableEurekaClient
// @RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MyRule.class) // 重写负载均衡配置
public class DeptConsumer80_App {
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer80_App.class, args);
	}
}
