package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dto.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee emp);
	public Employee[] showEmployee();
	public Employee searchEmployee(Integer empId);
	public Employee updateEmployee(Integer empId);
	public Employee removeEmployee(Integer empId);
}
