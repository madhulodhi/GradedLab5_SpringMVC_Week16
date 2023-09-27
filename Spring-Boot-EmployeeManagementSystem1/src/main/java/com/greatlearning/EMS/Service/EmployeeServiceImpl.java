
package com.greatlearning.EMS.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.EMS.Model.Employee;
import com.greatlearning.EMS.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) { // Use Long for the id parameter
		return employeeRepository.findById(id).get(); // Handle the possibility of null
	}

	@Override
	public Employee updateEmployee(Long id,Employee employee) {
		Employee employee2=getEmployeeById(id);
		employee2.setFirstName(employee.getFirstName());
		employee2.setLastName(employee.getLastName());
		employee2.setEmail(employee.getEmail());
		return saveEmployee(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) { // Use Long for the id parameter
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		
	}

}
