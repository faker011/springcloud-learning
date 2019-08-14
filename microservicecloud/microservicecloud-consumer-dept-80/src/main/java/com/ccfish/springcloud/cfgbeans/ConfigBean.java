package com.ccfish.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean // boot-->spring applicationContext.xml --->@Configuration 配置 ConfigBean = applicationContext.xml
{
	@Bean
	@LoadBalanced // Ribbon 客户端负载均衡
	public RestTemplate geTemplate()
	{
		return new RestTemplate();
	}
	/**
	 * 配置自定义负载均衡规则,代替默认轮询规则
	 * https://github.com/Netflix/ribbon/tree/master/ribbon-loadbalancer/src/main/java/com/netflix/loadbalancer
	 * @return
	 */
	@Bean
	public IRule myIRule() {
		return new RoundRobinRule();
	}
}
