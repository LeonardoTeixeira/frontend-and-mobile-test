# frontend-and-mobile-test

Enclosed in this project, lies a small Java application that expose a 
REST service that returns a list of People.

This service can be reached using the following URL:

    http://localhost:8090/rest/people

It will return a JSON object. To run the service, you will need to build the application.
For that, you will need to install Java JDK and Maven.

After you sucessfully installed everything, just open a command and run:


    mvn clean package
    
To run, either call Java or run Maven

    java -jar target/people-rest.war
    
or

    mvn spring-boot:run
    
## Proposed Exercise

Create a mobile app based on either cordova, ionic, phonegap or native to present the resulting data from the REST service. The way you present it is up to you, as long you follow the premises.

Premises:
* The app must work at least on the Android platform.
* The application must be implemented using AngularJS. 
* The application must compile without using any Java/Android IDE. You can use whatever automation tool like Gulp, Grunt, Maven, Gradle, etc.
* You are free to change the application included in every aspect.

## Challenges

1. Create behavior for including and removing people. (You can use any In-memory datasource)
2. Replace the Java Application by a Node.js one or ...
3. ...automate test using an end-to-end test framework for AngularJS. 


## Measuring results
Send the exact instructions on how to install dependencies, compile and run
the application, in a way even a newbie would understand. 
