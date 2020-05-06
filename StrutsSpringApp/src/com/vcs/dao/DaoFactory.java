package com.vcs.dao;

public class DaoFactory {

	private static FloorDao floorDao;

	public void setFloorDao(FloorDao floorDao) {
		this.floorDao = floorDao;
	}

	public static FloorDao getFloorDao() {
		
		if(floorDao==null){
			floorDao=new FloorDaoImpl();
		}
		return floorDao;
	}
	
	
}
