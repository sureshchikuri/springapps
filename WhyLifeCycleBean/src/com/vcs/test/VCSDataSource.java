package com.vcs.test;

import org.springframework.beans.factory.InitializingBean;

public class VCSDataSource implements InitializingBean{

	private static String jndiName;
	
	public void setJndiName(String jndiName) {
		VCSDataSource.jndiName = jndiName;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("jandiName:"+jndiName);
		
	}
	
	
}
