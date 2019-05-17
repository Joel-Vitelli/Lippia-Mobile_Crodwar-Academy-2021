Proyecto de ejemplo Mobile usando Lippia 1.6 (url landing )
requisitos : 
instalado JDK 8,
docker 1.7 o superior
docker-composite compatible
maven 3.3

Pasos para ejecutar el proyecto:
	1 Clonar el proyecto  con git clone 
	   git clone https://bitbucket.org/crowdarautomation/appiumcucumberexampleproject.git
	2 Clonar el stack 
	  git clone https://bitbucket.org/crowdarautomation/mobile-dkr-fwk.git	   
	3 copiar el archivo apk ubicado en appiumcucumberexampleproject/src/main/resources/mobile/app/ApiDemos.apk a /mobile-dkr-fwk/example/sample_apk/ApiDemos.apk
	4 levantar appium stack y los emuladores con los siguientes comandos 
	  docker-composite up -d
	5 esperar a que los contenedores docker esten andando con el siguiente comando
	  docker container ps
	  el estado de todos los contenedores debe quedar en healthy 
	6 una vez levantado el stack hay que correr el proyecto de ejemplo con el siguiente comando 
	 mvn clean -P Stack test 
	7 deberia empezar a correr el proyecto, y podriamos ver los novnc en http://localhost:6082/  y en http://localhost:6082/
	8 al finalizar la corrida podriamos ver el reporte en html generado para extent en la carpeta appiumcucumberexampleproject/target/cucumber-report	
	
	
	
		
	
	
	  
	
	
	    















