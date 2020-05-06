package com.vcs.dao;

import java.util.List;

import com.vcs.model.WsLov;

public interface WorkStationDao {

	List getTypeList(WsLov wsLov);

	List getCommonList(WsLov wsLov);

}
