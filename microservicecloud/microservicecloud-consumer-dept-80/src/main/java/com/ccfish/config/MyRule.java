package com.ccfish.config;

import org.springframework.context.annotation.Bean;

import com.netflix.loadbalancer.IRule;

/**
 * 不能和包扫描注解在一个包下，否则导致所有服务都使用对应配置
 * 主启动类及以下为包扫描路径
 * @author ciaos
 *
 */
// @Configuration
public class MyRule{

	@Bean
	public IRule getIRule(){
		return new RandomRule_ZY();
	}

}
