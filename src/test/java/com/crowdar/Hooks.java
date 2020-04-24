package com.crowdar;

import com.crowdar.core.PropertyManager;
import com.crowdar.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks {

	@Before
	public void before() {
		System.out.println(PropertyManager.getProperty("crowdar.driverHub"));
	}
	
    @After
    public void afterScenario(){
        DriverManager.dismissCurrentDriver();
    }

}
