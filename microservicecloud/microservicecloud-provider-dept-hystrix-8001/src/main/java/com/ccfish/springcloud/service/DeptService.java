package com.ccfish.springcloud.service;

import java.util.List;

import com.ccfish.springcloud.entity.Dept;

public interface DeptService {
	
	public boolean addDept(Dept dept);
	
	public Dept get(Long id);
	
	public List<Dept> list();
}
