package com.vcs.service;

import com.vcs.dao.Dao;

public abstract class Service {
	
	/*private Dao dao;
	 
	public Service(Dao dao){
		this.dao=dao;
	}*/
	
	public abstract Dao getDao();

	/*public void serviceMethod(){
		System.out.println("serviceMethod");
	}*/
}
