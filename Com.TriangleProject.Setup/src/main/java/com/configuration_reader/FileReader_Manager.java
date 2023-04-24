package com.configuration_reader;

public class FileReader_Manager {
	
	
	public FileReader_Manager() {
	}
	
	
	public static FileReader_Manager getInstanceConfig() {
		FileReader_Manager f=new FileReader_Manager();	
		return f;
		
	}
	
	public static Configuration_reader getConfigdata() throws Throwable {
		Configuration_reader c=new Configuration_reader();	
		return c;
	}
		
	

}
