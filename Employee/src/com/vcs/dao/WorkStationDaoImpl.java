package com.vcs.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.vcs.model.WsLov;

public class WorkStationDaoImpl extends HibernateDaoSupport implements
		WorkStationDao {

	@Override
	public List getTypeList(WsLov wsLov) {

		List typeList = null;
		typeList = getSession().createCriteria(WsLov.class).add(
				Restrictions.eq("type", "type")).list();

		return typeList;
	}

	@Override
	public List getCommonList(WsLov wsLov) {

		List commonList = null;
		commonList = getSession().createCriteria(WsLov.class).add(
				Restrictions.eq("type", "YN")).list();

		return commonList;
	}

}
