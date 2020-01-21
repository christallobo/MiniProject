package com.lti.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lti.bean.Employee;
import com.lti.dao.EmployeeDao;
import com.lti.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao dao;
	public EmployeeServiceImpl() throws SQLException {
		 dao = new EmployeeDaoImpl();
	}
	
	@Override
	public List<Employee> getEmployeeDetails(int eid) {
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		List<Employee> myList=new ArrayList<Employee>();
		myList=dao.getAllEmployees();
		return myList;
	}

	@Override
	public int addAnEmployee(Employee emp) throws ClassNotFoundException, SQLException {
		//List<Employee> myList=new ArrayList<Employee>();
		 int myList=dao.addAnEmployee(emp);
		return myList;
	}

	@Override
	public void deleteAnEmployee(int id) throws ClassNotFoundException, SQLException {
		dao.deleteAnEmployee(id);
		
	}
	
	
}
