package com.gsb.employee.properties.dao;

import java.util.List;

import com.gsb.employee.lovMappings.PropertiesLov;

public interface PropertiesDao {

	List<PropertiesLov> getType(String type);

	
}
