package com.cg.employeemanagement.dto;

public class Project {
	private Integer projectId;
	private String projectName;
	private Double projectCost;
	private Employee[] listOfEmployees;
	
	
	
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Double getProjectCost() {
		return projectCost;
	}
	public void setProjectCost(Double projectCost) {
		this.projectCost = projectCost;
	}
	public Employee[] getListOfEmployees() {
		return listOfEmployees;
	}
	public void setListOfEmployees(Employee[] listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}
	
	

}
