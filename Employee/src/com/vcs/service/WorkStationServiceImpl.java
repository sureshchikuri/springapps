package com.vcs.service;

import java.util.List;

import com.vcs.dao.WorkStationDao;
import com.vcs.model.WsLov;


public class WorkStationServiceImpl implements WorkStationService{

	private WorkStationDao workStationDao;
	
	public void setWorkStationDao(WorkStationDao workStationDao) {
		this.workStationDao = workStationDao;
	}

	@Override
	public List getCommonList(WsLov wsLov) {

		List commonList=null;
		commonList=workStationDao.getCommonList(wsLov);
		return commonList;
	}

	@Override
	public List getTypeList(WsLov wsLov) {

		List typeList=null;
		typeList=workStationDao.getTypeList(wsLov);
		return typeList;
	}
	
}
