package com.greatlearning.EMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.EMS.Model.Employee;
@Repository//for creating beans
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
