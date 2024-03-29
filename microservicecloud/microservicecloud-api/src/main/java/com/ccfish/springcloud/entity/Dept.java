package com.ccfish.springcloud.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{// 必须序列化
	// 主键
	private Long deptno;
	// 部门名称
	private String dname;
	// 来自哪个数据库
	private String db_source;
	
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
}
