package com.ccfish.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccfish.springcloud.dao.DeptDao;
import com.ccfish.springcloud.entity.Dept;
import com.ccfish.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;
	
	@Override
	public boolean addDept(Dept dept) {
		
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list() {
		
		return deptDao.findAll();
	}

}
