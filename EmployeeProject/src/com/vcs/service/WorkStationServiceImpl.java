package com.vcs.service;

import java.util.List;

import com.vcs.dao.WorkStationDao;
import com.vcs.hibernate.Workstationlov;


public class WorkStationServiceImpl implements WorkStationService{

	private WorkStationDao workStationDao;
	
	public void setWorkStationDao(WorkStationDao workStationDao) {
		this.workStationDao = workStationDao;
	}

	@Override
	public List getCommonList(Workstationlov workstationlov) {

		List commonList=null;
		commonList=workStationDao.getCommonList(workstationlov);
		return commonList;
	}

	@Override
	public List getTypeList(Workstationlov workstationlov) {

		List typeList=null;
		typeList=workStationDao.getTypeList(workstationlov);
		return typeList;
	}
	
	
}
