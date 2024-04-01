package com.app.raghu.service;

import java.util.List;

import com.app.raghu.entity.Employee;

public interface IEmployeeService {
	
	public abstract Integer saveEmployee(Employee e);
	public abstract List<Employee> getAllEmployees();
	public abstract void deleteEmployee(Integer id);
	public abstract Employee getOneEmployee(Integer id);
	public abstract void updateEmployee(Employee e);

}
