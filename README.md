#Lippia Mobile test project 

##Purpose: 
The following project has the purpose of demonstrate and let test automation developers to 
to test a Mobile App using Lippia Automation Framework and Docker Android stack https://github.com/budtmo/docker-android, based on Budi Utomo Docker Android project.

![Lippia Architecture Mobile](https://bitbucket.org/crowdarautomation/lippia-mobile-example-project/raw/1f4703f7fb15d8dc42add5406530c8daaa333ce0/arquitecture-mobile.png)


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
	
	
		
	
	
	  
	
	
	    















