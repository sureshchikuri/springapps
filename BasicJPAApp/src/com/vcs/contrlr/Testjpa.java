package com.vcs.contrlr;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Testjpa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee employee=new Employee();
		
		employee.setEmpId(197);
		
		employee.setEmpName("surichikuri");
		
		employee.setEmpsal("10000");
		
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("BasicJPAAppPU");
		
		EntityManager entityManager=managerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(employee);
		
		entityTransaction.commit();
		

	}

}
