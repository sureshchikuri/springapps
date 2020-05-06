package com.vcs.test;

import java.io.FileInputStream;


public class Test {

	public static void main(String[] args) throws Exception {

		//Properties prop=new Properties();
		FileInputStream file= new FileInputStream("F:\\Programs/springApps/CommonDbUtilsApp/src/config.properties");
		//prop.load(Test.class.getClassLoader().getResourceAsStream("config.properties"));
		
		//System.out.println(prop.getProperty("username"));
	
		byte[] b = new byte[file.available()];
		
		file.read(b);
		
		for (int i = 0; i < b.length; i++) {
			 
            System.out.println((char)b[i]);
		}
	} 

}
