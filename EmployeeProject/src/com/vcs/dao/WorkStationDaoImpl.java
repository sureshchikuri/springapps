package com.vcs.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.vcs.hibernate.Workstationlov;

public class WorkStationDaoImpl extends HibernateDaoSupport implements
		WorkStationDao {

	@Override
	public List getTypeList(Workstationlov workstationlov) {

		List typeList = null;
		typeList = getSession().createCriteria(Workstationlov.class).add(
				Restrictions.eq("type", "ws_type")).list();

		return typeList;
	}

	@Override
	public List getCommonList(Workstationlov workstationlov) {

		List commonList = null;
		commonList = getSession().createCriteria(Workstationlov.class).add(
				Restrictions.eq("type", "YN")).list();

		return commonList;
	}

}
