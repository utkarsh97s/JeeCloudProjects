package com.cg.employeemanagement.service;
import com.cg.employeemanagement.dao.*;
import com.cg.employeemanagement.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	 EmployeeDao emp1 = new EmployeeDaoImpl();
	    
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		return emp1.addEmployee(emp);
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		
		return emp1.showEmployee();	}

	public Employee searchEmployee(Integer empId) {
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
