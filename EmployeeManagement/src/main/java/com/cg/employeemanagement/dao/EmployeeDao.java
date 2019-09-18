package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;

public interface EmployeeDao {
	public Employee addEmployee(Employee emp);
	public Employee[] showEmployee();
	public Employee searchEmployee(Integer empId);
	public Employee updateEmployee(Integer empId);
	public Employee removeEmployee(Integer empId);
}
