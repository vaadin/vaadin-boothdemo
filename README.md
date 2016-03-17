# Vaadin development contest starter

This is a starting point for a development contest. You'll need a Java 8 installation and a Java IDE like IntelliJ, NetBeans or Eclipse. Make sure you signed up for the contest at Vaadin booth, then you are ready to go!

## Download the starter project

Download [the starter project as zip file](https://github.com/mstahv/expo-starter/archive/master.zip) and extract the project to your computer.

## Import the Maven project in your IDE

If you are using IntelliJ or NetBeans, just open the project from the downloaded project. In Eclipse, use "Import->Import e"

If you are new to Maven, you could look into [a Maven tutorial](https://vaadin.com/blog/-/blogs/the-maven-essentials-for-the-impatient-developer).

## Start the application

Just run the main method of the Application class in the project. It will Spring Boot the application and you can access it from http://localhost:8080/.

## Code your answer

Your answer goes to MyUI class. As a draft here is a tiny "hello world" example. Your job is to create a user interface of two text fields and a button, which collects a name and email and then passes those values to MyService class, which is already autowired to the application stub.

The final app should look something like this:
![Final UI](https://raw.githubusercontent.com/mstahv/expo-contest/master/final-ui.png)

When you post your form, your answer (MyUI class) is posted the competition server and you'll participate in a lottery of great prizes! An exception is thrown if there is no network connection or there is some other unexpected issue.

Happy hacking!

