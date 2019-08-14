package com.ccfish.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ccfish.springcloud.entity.Dept;

import feign.hystrix.FallbackFactory;
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				return null;
			}
			
			@Override
			public Dept get(long id) {
				return new Dept().setDname("接口类型服务熔断，降低耦合");
			}
			
			@Override
			public boolean add(Dept dept) {
				return false;
			}
		};
	}

}
