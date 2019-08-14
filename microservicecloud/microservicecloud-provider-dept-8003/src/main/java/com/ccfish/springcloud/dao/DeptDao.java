package com.ccfish.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ccfish.springcloud.entity.Dept;

@Mapper
public interface DeptDao {
	public boolean addDept(Dept dept);
	
	public Dept findById(Long id);
	
	public List<Dept> findAll();
}
