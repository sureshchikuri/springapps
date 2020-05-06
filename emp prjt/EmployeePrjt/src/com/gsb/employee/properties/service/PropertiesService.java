package com.gsb.employee.properties.service;

import java.util.List;

import com.gsb.employee.lovMappings.PropertiesLov;

public interface PropertiesService {
	public List<PropertiesLov> getType(String type);

}
