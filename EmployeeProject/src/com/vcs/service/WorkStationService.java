package com.vcs.service;

import java.util.List;

import com.vcs.hibernate.Workstationlov;

public interface WorkStationService {


	List getTypeList(Workstationlov workstationlov);

	List getCommonList(Workstationlov workstationlov);
}
