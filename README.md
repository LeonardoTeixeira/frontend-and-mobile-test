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

    java -jar target/people-rest.war
    
or

    mvn spring-boot:run
    
## Proposed Exercise

Create an app to present the resulting data from the REST service. The way you present is up to you, as long you follow the premises.

Premises:
* DO NOT USE *\<table\>*
* The application must be implemented using _AngularJS_. 
* The application must be _Responsive_.
* The application must be presented in only three resolutions: _Full HD_, _HD_ and _Wide VGA_. 
* Do _not_ use any _layout frameworks_ like Bootstrap, Foundation, etc. Implement your own solution. Feel free to use other frameworks for UX 
* You are free to change the application included in every aspect.

## Challenges

1. Minify using the Automation Tool of your choice, except MAVEN plugins.
2. Replace the Java Application by one written using Node.js _or_ ...
3. ...automate test using an end-to-end test framework for AngularJS. 


## Measuring results
Send the exact instructions on how to install dependencies, compile and run
the application, in a way even a newbie would understand. 
