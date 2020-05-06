package com.gsb.employee.properties.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.gsb.employee.lovMappings.PropertiesLov;

public class PropertiesDaoImpl extends HibernateDaoSupport implements
		PropertiesDao {

	@Override
	public List<PropertiesLov> getType(String type) {
		List<PropertiesLov> workStationTypeList = null;
		Criteria criteria = getSession().createCriteria(PropertiesLov.class);
		criteria.add(Restrictions.eq("type", type));
		workStationTypeList = criteria.list();
		return workStationTypeList;
	}
}
