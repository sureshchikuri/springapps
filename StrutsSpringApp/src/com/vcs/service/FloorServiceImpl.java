package com.vcs.service;

import com.vcs.dao.FloorDao;

public class FloorServiceImpl implements FloorService{

	private FloorDao floorDao;
	
	
	public void setFloorDao(FloorDao floorDao) {
		this.floorDao = floorDao;
	}
	@Override
	public void serviceMethod() {

		//FloorDao floorDao =DaoFactory.getFloorDao();
		floorDao.daoMethod();
		System.out.println("serviceMethod");
	}

}
