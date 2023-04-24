package com.configuration_reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_reader {
	
	public static Properties proper;
	  public Configuration_reader() throws Throwable {
		  
		  File f=new File("C:\\10 NOVember automation\\My code\\Com.TriangleProject.Setup\\src\\main\\java\\com\\configuration_properties\\Configyration_properties.properties");
		  FileInputStream f1=new FileInputStream(f); 
		  proper=new Properties();	
		  proper.load(f1);
	}

	  
	  public String getURL() {
		 String property= proper.getProperty("URL");
		 return property;
		  	  
	  }
	  
	  

	  public String getUsername() {
		 String property= proper.getProperty("UserName");
		 return property;
		  	  
	  }
	  

	  public String getPassword	() {
		 String property= proper.getProperty("PassWord");
		 return property;	  
	  }
	  
	  public String getclinicianname	() {
			 String property= proper.getProperty("clinicianname");
			 return property;	  
		  }
	  
	  public String getPasswordc	() {
			 String property= proper.getProperty("Passwordc");
			 return property;	  
		  }
	 

	  public String getFirstname	() {
		 String property= proper.getProperty("FirstName");
		 return property;
		 
	  }

	  public String getLastname	() {
		 String property= proper.getProperty("LastName");
		 return property;
		 
	  }
	  public String getEmail_new	() {
			 String property= proper.getProperty("email");
			 return property;
			 
		  }
	  public String getSearchbox	() {
			 String property= proper.getProperty("SearchBox");
			 return property;
			 
		  }
	  
	  public String getSearchboxtwo	() {
			 String property= proper.getProperty("searchboxtwo");
			 return property;
	  }

	  public String getNameLastEdit () {
			 String property= proper.getProperty("NameLastEdit");
		     return property;

		  }
	  public String getMobileProfile () {
			 String property= proper.getProperty("MobileNumber");
		     return property;

		  }
	  public String getPatientname () {
			 String property= proper.getProperty("Patientname");
		     return property;

		  }
	  public String getDate () {
			 String property= proper.getProperty("Date");
		     return property;	

		  }
	  public String getPatientId () {
			 String property= proper.getProperty("PatientId");
		     return property;

		  }
	  public String getRater () {
			 String property= proper.getProperty("Rater");
		     return property;

		  }
	  public String getForumtitle() {
			 String property= proper.getProperty("ForumTitle");
		     return property;		 		
          }
	  public String gettopicdescription() {
			 String property= proper.getProperty("TopicDescription");
		     return property;		 		
          }
	  public String getEnterPost() {
			 String property= proper.getProperty("EnterPost");
		     return property;		 		
       }
}  
