package com.cg.employeemanagement.ui;

import java.util.Scanner;

import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.service.*;
import com.cg.employeemanagement.dao.*;


public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter the Employee Id");
		int id = scr.nextInt();
		
		System.out.println("Enter the Employee Name");
		String name= scr.next();
		
		System.out.println("Enter the Employee Salary");
		double sal= scr.nextInt();
		
		System.out.println("Enter the Department Id");
		int did=scr.nextInt();
		
		System.out.println("Enter the department name");
		String dname = scr.next();
		
		Department dep= new Department();
		dep.setDeptId(did);
		dep.setDeptName(dname);
		
		
		Employee emp = new Employee();
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpSalary(sal);
		emp.setDepartment(dep);
		
		EmployeeService service = new EmployeeServiceImpl();
		Employee[] emp2 = new Employee[5];
		for(int j=0;j<5;j++) {
		service.addEmployee(emp);
		}
		Employee empArray[] =service.showEmployee();

		
		for(int i=0;i<5;i++) {
			//if(i==0) {
				System.out.println(empArray[i].getEmpId());
				System.out.println(empArray[i].getEmpName());
				System.out.println(empArray[i].getEmpSalary());			//}
			

		}
		
	}

}
