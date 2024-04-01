package com.app.raghu.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.raghu.entity.Employee;
import com.app.raghu.repo.EmployeeRepository;
import com.app.raghu.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Integer saveEmployee(Employee e) {		
			e = repo.save(e);
		return e.getEmpId();
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = repo.findAll();
		return list;
	}

	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		Optional<Employee> opt = repo.findById(id);
		if(opt.isPresent()) {
			Employee e=opt.get();
			return e;
		}
		return null;
	}

	@Override
	public void updateEmployee(Employee e) {
		repo.save(e);
	}

}
