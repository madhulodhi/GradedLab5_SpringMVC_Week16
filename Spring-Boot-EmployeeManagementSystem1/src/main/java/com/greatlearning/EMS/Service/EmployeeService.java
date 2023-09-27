package com.greatlearning.EMS.Service;

import java.util.List;

import com.greatlearning.EMS.Model.Employee;

public interface EmployeeService {

	 List<Employee> getAllEmployees();
	 
	 Employee saveEmployee(Employee employee);
	 
	 Employee getEmployeeById(Integer id);
	 
	 Employee updateEmployee(int id,Employee employee);
	 
	 void deleteEmployeeById(int id);

	void deleteEmployeeById(Long id);

	Employee updateEmployee(Long id, Employee employee);

	Employee getEmployeeById(Long id);
		 
}
