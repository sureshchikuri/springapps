package com.vcs.service;

public class ServiceFactory {

	
	private static FloorService floorService;

	public void setFloorService(FloorService floorService) {
		this.floorService = floorService;
	}

	public static FloorService getFloorService() {
		
		if(floorService==null){
			floorService=new FloorServiceImpl();
		}
		return floorService;
	}
}
