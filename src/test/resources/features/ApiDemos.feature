Feature: As a potential client i want to interact with the mobile application

  @Smoke
  Scenario: The client starts the applicacion ApiDemos accesing to Bouncing Balls
    Given The user opens the 'API Demos' application
    When The user clicks over 'Animation' menu element 
    When The user clicks over 'Bouncing Balls' menu element
    Then The user sees the application 'Animation/Bouncing Balls' open
    
  @Smoke
  Scenario: The client starts the applicacion ApiDemos accesing to cloning 
    Given The user opens the 'API Demos' application
    When The user clicks over 'Animation' menu element 
    When The user clicks over 'Cloning' menu element
    Then The user sees the application 'Animation/Cloning' open
    
  @Smoke
  Scenario: The client starts the applicacion ApiDemos accesing to Multiple Properties
    Given The user opens the 'API Demos' application
    When The user clicks over 'Animation' menu element 
    When The user clicks over 'Multiple Properties' menu element
    Then The user sees the application 'Animation/Multiple Properties' open
