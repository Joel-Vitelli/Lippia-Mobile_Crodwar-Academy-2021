#Lippia Mobile test project 

##Purpose: 
The following project has the purpose of demonstrate and let test automation developers to 
to test a Mobile App using Lippia Automation Framework and Docker Android stack https://github.com/budtmo/docker-android, based on Budi Utomo Docker Android project.

![Lippia Architecture Mobile](https://bitbucket.org/crowdarautomation/lippia-mobile-example-project/raw/f3158fdbfe95d326ed5b386f13432d8e48602cb0/architecture-mobile.png)

##Scenarios: 
The Scenarios can be written using BDD metodology. This project includes Cucumber as BDD. On each declared step you can insert the calls defined from service classes

![Lippia Scenarios Mobile](https://bitbucket.org/crowdarautomation/lippia-mobile-example-project/raw/3fa624501f0109f4d1db2f46ebdc2c512aeaedd4/gherkin.png)


##Requirements :
- git client   
     https://www.atlassian.com/git/tutorials/install-git
	 
- JDK 8 	    
	  https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html   
	  https://openjdk.java.net/install/   
	 
+ maven 3   
	 https://maven.apache.org/download.cgi   


##Pre Step:   
	
- Start "Mobile Docker framework" to consume the emulated device. see *https://bitbucket.org/crowdarautomation/mobile-sandbox/*

##Steps:
1. Clone example test source project     
	```git clone https://bitbucket.org/crowdarautomation/lippia-mobile-example-project.git```   

2. Run tests from project root location    
    ```mvn clean -P Stack test```  
	
3. You can view the interaction between tests and emulated device by accesing at http://localhost:6080/

4. When the execution has finished, the output report can be accessed at **[PROJECT_ROOT]/target/cucumber-report**
	
	
		
	
	
	  
	
	
	    















