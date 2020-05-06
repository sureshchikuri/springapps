package com.gsb.emplloyee.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.gsb.employee.exception.EmployeeDaoException;
import com.gsb.employee.model.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	@Override
	public void insertEmployee(Employee employee) {
		
		getSession().save(employee);

	}catch (HibernateException  he) {
		throw new EmployeeDaoException("DaoException",he);
	}

	@Override
	public List searchEmployee(Employee employee) {
		
		List employeeList=null;
		
		String isActive=employee.getIsActive();
		Integer employeeId=employee.getEmployeeId();
		String firstName=employee.getFirstName();
		String lastName=employee.getLastName();
		String email=employee.getEmail();
		Integer mobile=employee.getMobile();
		
		try{
			Criteria criteria=getSession().createCriteria(Employee.class);
			
			if(isActive!=""){
				criteria.add(Restrictions.eq("isActive", isActive));
			}
			
			if(firstName!=""){
				criteria.add(Restrictions.eq("firstName", firstName));
			}
			
			if(lastName!=""){
				criteria.add(Restrictions.eq("lastName", lastName));
			}
			if(email!=""){
				criteria.add(Restrictions.eq("email", email));
			}
			if(mobile!=""){
				criteria.add(Restrictions.eq("mobile", mobile));
			}
			if(employeeId!=""){
				criteria.add(Restrictions.idEq(employeeId));
			}
			employeeList=criteria.list();
		}
		catch (HibernateException he) {
			throw new EmployeeDaoException("error",he);
		}
		return employeeList;
	}

	@Override
	public List<Integer> getManage(String Ismanager)throws EmployeeDaoException {
		List<Integer> managerList=null;
		try {
			Criteria criteria=getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("Employee.Ismanager", Ismanager));
		criteria.setProjection(Projections.property("Ismanager"));
		managerList=criteria.list();
		} catch (HibernateException he) {
			throw new EmployeeDaoException("error",he);
		}
		
		
		return managerList;
		
	}

}
