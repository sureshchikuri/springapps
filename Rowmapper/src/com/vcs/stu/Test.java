package com.vcs.stu;

import java.util.List;

import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");

		String query = "SELECT EMPID,EMPNAME FROM EMPLOYEE";

		List empList = template.query(query, new EmployeeRowmapper());
		
		for(int i=0;i<empList.size();i++)
		{
			Employee emp=(Employee) empList.get(i);
			
			System.out.println(emp.getEmpId());
			
			System.out.println(emp.getEmpname());
			
			//System.out.println(empList.toString());
		}


	}

}
