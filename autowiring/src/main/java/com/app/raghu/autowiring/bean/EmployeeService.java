package com.app.raghu.autowiring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("esobj")
public class EmployeeService {
	@Autowired(required = false)
	private EmployeeDao dao;//HAS-A relation

	@Override
	public String toString() {
		return "EmployeeService [dao=" + dao + "]";
	}
	
	

}
