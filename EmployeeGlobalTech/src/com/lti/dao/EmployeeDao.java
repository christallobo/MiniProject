package com.lti.dao;

import java.sql.SQLException;
import java.util.List;

import com.lti.bean.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException;

	public int addAnEmployee(Employee emp) throws ClassNotFoundException, SQLException;

	public void deleteAnEmployee(int id) throws SQLException, ClassNotFoundException;
}
