package com.Runner_Class;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources\\Feature_File\\Forum_Page.feature",
glue= "com.Step_definition",
dryRun=false ,
monochrome = true,plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" } )
    



public class Testr_Runner {
	
	
	
	
	
	
	
	

}
