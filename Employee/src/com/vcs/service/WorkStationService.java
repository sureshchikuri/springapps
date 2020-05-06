package com.vcs.service;

import java.util.List;

import com.vcs.model.WsLov;

public interface WorkStationService {


	List getTypeList(WsLov wsLov);

	List getCommonList(WsLov wsLov);
}
