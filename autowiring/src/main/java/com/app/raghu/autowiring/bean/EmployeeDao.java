package com.app.raghu.autowiring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("edao")
public class EmployeeDao {
	
	@Value("ORACL")
	private String dbName;

	@Override
	public String toString() {
		return "EmployeeDao [dbName=" + dbName + "]";
	}
	
	

}
