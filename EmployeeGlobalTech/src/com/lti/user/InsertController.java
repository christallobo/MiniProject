package com.lti.user;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.bean.Employee;
import com.lti.services.EmployeeService;
import com.lti.services.EmployeeServiceImpl;

@WebServlet("/insert.do")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeService emp=null;
		try {
			emp=new EmployeeServiceImpl();
			Employee employee=new Employee();
			employee.setFname(request.getParameter("fname"));
			employee.setLname(request.getParameter("lname"));
			employee.setDoj(request.getParameter("doj"));
			employee.setDept(request.getParameter("dept"));
			
			int i=emp.addAnEmployee(employee);
			if(i>0){
				System.out.println("Employee added sccessfully.....");
			}
			else{
				System.out.println("Employee details are not added....");
			}
			
	
//			List<Employee> eList=emp.getAllEmployees();
			request.getServletContext().setAttribute("value", i);
//	        
	        response.sendRedirect("insert.jsp");
			
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
