package com.bridgelabz.springconcepts.component;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
	private int eid;
	private String name;
	
	@Autowired
	private DepartmentBean deptBean;
	public static final org.slf4j.Logger logger = LoggerFactory.getLogger(EmployeeBean.class);
	
	public EmployeeBean() {
		
	}
	@Autowired
	public EmployeeBean(DepartmentBean deptBean) {
		logger.trace("*** Autowriting by using @Autowire annotation on constructor ***");
		
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public DepartmentBean getDeptBean() {
		return deptBean;
	}
	
	@Autowired
	public void setDeptName(DepartmentBean deptBean) {
		logger.trace("*** Autowriting by using @Autowire annotation on Setter ***");
		this.deptBean = deptBean;
	}
	
	public void showEmployeeDetails() {
		logger.debug("Employee Id: {}",eid);
		logger.debug("EMployee Name: {}",name);
		deptBean.setDeptName("Electronics & Telecommunication");
		logger.debug("Department : {}",deptBean.getDeptName());
	}
}
