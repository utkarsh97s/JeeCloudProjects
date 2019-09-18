package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
    Employee[] emp1= new Employee[5];

	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		for (int i = 0;i<5;i++)
		{this.emp1[i]= emp;}
		return null;
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		return emp1;
	}

	public Employee searchEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee updateEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee removeEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
