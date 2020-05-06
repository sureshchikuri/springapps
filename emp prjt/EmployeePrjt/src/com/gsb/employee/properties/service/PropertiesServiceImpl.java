package com.gsb.employee.properties.service;

import java.util.List;
import java.util.Properties;

import com.gsb.employee.lovMappings.PropertiesLov;
import com.gsb.employee.properties.dao.PropertiesDao;

public class PropertiesServiceImpl implements PropertiesService {
	private PropertiesDao propertiesDao;

	public void setPropertiesDao(PropertiesDao propertiesDao) {
		this.propertiesDao = propertiesDao;
	}

	@Override
	public List<PropertiesLov> getType(String type) {

		List<PropertiesLov> properList = null;
		properList = propertiesDao.getType(type);
		return properList;
	}

}
