package com.gsb.employee.util;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jHelper {

	static Logger logger = null;
	static {
		DOMConfigurator.configure(Log4jHelper.class.getClassLoader()
				.getSystemResource("log4j.xml"));

	}

	public static Logger getLogger(Class clazz) {
		logger = Logger.getLogger(clazz);
		return logger;

	}

}
