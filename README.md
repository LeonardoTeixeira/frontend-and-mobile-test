# front-end-angularjs-automate-tasks

Enclosed in this project, lies a small Java application that expose a 
REST service that returns a list of People.

This service can be reached using the following URL:

http://localhost:8090/rest/people

It will return a JSON object. To run the service, you will need to build the application.
For that, you will need to install Java JDK and Maven.

After you sucessfully installed everything, just open a command and run:


    mvn clean package
    
To run, either call Java or run Maven

    java -jar target/people.war
    
or

    mvn spring-boot:run
    
## Proposed Exercise

Create an app to present the resulting data from the REST service.

Premises:
* The application should use AngularJS. 
* The application must be responsible.
* The application must be presented in three resolutions: Full HD, HD and Wide VGA.
* Do not use any layout frameworks like Bootstrap, Foundation, etc. Feel free frameworks 
for UX 
* You are free to change the application included in every aspect.

## Challenges

1. Minify using the automation Tool of your choice
2. Replace the Java Application by one written using Node.js _or_ ...
3. ...automate test using an end-to-end test framework for AngularJS. 


## Measuring results
Send the exact instructions on how to install dependencies, compile and run
the application, in a way even a newbie would understand. 
