# frontend-and-mobile-test

Enclosed in this project, lies a small Java application that expose a 
REST service that returns a list of People.

This service can be reached using the following URL:

    http://localhost:8090/rest/people

It will return a JSON object. To run the service, you will need to build the application.
For that, you will need to install Java JDK and Maven.

After you sucessfully installed everything, just open a command and run:


    ./mvnw clean spring-boot:run
    
or

    mvn clean spring-boot:run
    
## Proposed Exercise

Create a mobile app based on either Ionic, Phonegap, Xamarin or pure Apache Cordova, or Native to present the resulting data from the REST service. The way you present it is up to you, as long you follow the premises.

Premises:
* The app must work at least on the Android platform.
* The application must compile without using any IDE (using command-line interface). You can use whatever automation tool like Gulp, Grunt, Maven, Gradle, Ant, scripts, etc.
* You are free to change the application included in every aspect.

## Challenges

1. Create behavior for including and removing people. (You can use any In-memory datasource)
2. Replace the Java Application by a Node.js one or ...
3. ...automate tests using any end-to-end test framework on the Market. 


## Measuring results
Send the exact instructions on how to install dependencies, compile and run
the application, in a way even a newbie would understand. 