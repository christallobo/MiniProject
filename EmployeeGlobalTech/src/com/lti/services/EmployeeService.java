package com.lti.services;

import java.sql.SQLException;
import java.util.List;

import com.lti.bean.Employee;


public interface EmployeeService {
	List<Employee> getEmployeeDetails(int eid);
	public List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException;
	public int addAnEmployee(Employee emp) throws ClassNotFoundException, SQLException;
	void deleteAnEmployee(int id) throws ClassNotFoundException, SQLException; 
}
