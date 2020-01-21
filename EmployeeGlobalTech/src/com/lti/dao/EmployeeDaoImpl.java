package com.lti.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lti.bean.Employee;
import com.lti.util.DbUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	DbUtil util = null;
	Connection conn=null;
	
	public EmployeeDaoImpl() throws SQLException 
	{
		util = new DbUtil();
	}
	
	@Override
	public List<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		List<Employee> myList=null;
		
		myList= new ArrayList<>();			
		conn= util.getDataSource();
		Statement stmt= conn.createStatement();			
		ResultSet rs= stmt.executeQuery("Select * from Employee_1");	
		while(rs.next())
		{
			int eid=rs.getInt(1);
			String fname=rs.getString(2);
			String lname=rs.getString(3);
			String doj=rs.getString(4);
			String dept=rs.getString(5);
			Employee cust= new Employee(eid,fname,lname,doj,dept);
			myList.add(cust);		
		}
		return myList;	
	}

	@Override
	public int addAnEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		//Employee employee=new Employee();	
		conn= util.getDataSource();
		
		String sql = "insert into Employee_1 values(seq_eid.nextval,?,?,?,?)";
		PreparedStatement ps1 = conn.prepareStatement(sql);
		ps1.setString(1, employee.getFname());
		ps1.setString(2, employee.getLname());
		ps1.setString(3, employee.getDoj());
		ps1.setString(4, employee.getDept());
		
		int i = ps1.executeUpdate();
		if(i>0){
			System.out.println("Employee added sccessfully.....");
		}
		else{
			System.out.println("Employee details are not added....");
		}
		return i;
	}

	@Override
	public void deleteAnEmployee(int eid) throws SQLException, ClassNotFoundException {
		conn= util.getDataSource();
		Employee employee=new Employee();
		String query="delete from employee_1 where eid=?";
		PreparedStatement ps3=conn.prepareStatement(query);
		ps3.setInt(1,eid);
		int row=ps3.executeUpdate();
	}

}
