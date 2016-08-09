# Vaadin Expo booth example application

This is a starting point for showing how Vaadin works. You'll need a Java 8 installation and a Java IDE like IntelliJ, NetBeans or Eclipse. 

## Get the project

git clone git@gitlab.vaadin.com:fredu/vaadin-expo-something.git

## Import the Maven project in your IDE

If you are using IntelliJ or NetBeans, just open the project from the downloaded project. In Eclipse, use "Import -> Existing Maven Projects"

If you are new to Maven, you could look into [the Maven tutorial](https://vaadin.com/blog/-/blogs/the-maven-essentials-for-the-impatient-developer).

## Start the application

Just run the main method of the Application class in the project. It will Spring Boot the application and you can access it from http://localhost:8888/.

## The booth pitch

>Hi, do have you been using Vaadin before or do you wanna know what it is? 

(You only leave room for a positive answer -> good first start)

> Excellent, so what do you do yourself by the way? Are you a developer or an architect or ...?

(Be interested in them but don't push!)

> So Vaadin is a Java UI Framework. It's completely open source and used by 150 000 developers around the world. Maybe we could try it together, just take the keyboard and you can see for yourself.

(Open up http://demo.vaadin.com/dashboard/)

> This is what you can do with Vaadin 

(click around in dashboard) 

> Vaadin consists of hundreds of widgets that have a clear Java API from a table to graphs menus. The beauty of it is that the code is running on the server but the user interacts with an HTML5 app. And the communication between the browser and the server is all automated.

> What IDE are you using yourself?

(Open up the IDE that they were using; IDEA, Eclipse or Netbeans)

(run 'git clean' (get you to the starting point) and open the packages in the IDE to show the files in the project)

> As you can see there are two packages, one for the backend and another for the front-end. We're running this on Spring-boot but you can use and application server like jetty, tomcat, websphere or wildfly.

> Please try it yourself and I'll teach you in 30 seconds.

(Run as Java Application and open the URL http://localhost:8888/ in Chrome and Give the keyboard to the customer)

> Open up MyUI.java and look at Chrome. As you can see it's fairly simple. We have two TextFields and a button and then we have a Spring autowired backend-service.

> Please add a ClickListener to the button that calls the backend when the user clicks on it.

(Help them by suggesting to Autocomplete or opening up Sampler on the button http://demo.vaadin.com/sampler/#ui/interaction/button)

When done:

> The simple component-model with the well designed databinding and listener model makes it 50% faster to develop because you don't need to write so many lines of code.

(Open up Chrome with the app)

> That was easy! If you type in your email address you'll get links to a few video tutorials to get started with Vaadin.

> The fun part however starts when you start designing your UIs. Do you want to see how to simply drag and drop your UI in place even faster?

(git checkout designer)


