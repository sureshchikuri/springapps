package com.vcs.dao;

import java.util.List;

import com.vcs.hibernate.Workstationlov;

public interface WorkStationDao {

	List getTypeList(Workstationlov workstationlov);

	List getCommonList(Workstationlov workstationlov);

}
