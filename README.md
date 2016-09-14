# Vaadin Expo booth example application

This is a starting point for showing how Vaadin Framework works. You'll need a Java 8 installation and a Java IDE like IntelliJ, NetBeans or Eclipse. This is a Maven project so import it to your IDE. If you're new to maven see [the Maven tutorial](https://vaadin.com/blog/-/blogs/the-maven-essentials-for-the-impatient-developer).


## The Booth Pitch
```
git reset --hard
```

>Hi, have you been using Vaadin before or do you wanna know what it is? 

(Yes)

> Excellent! So what do you do yourself? Are you a developer or an architect or ...?

Be genuinely interested and understand what they do (priority 1)!

> Vaadin is a Java UI Framework. It's completely open source and used by 150 000 developers around the world. Let me show you what you can do with it:

Open up http://demo.vaadin.com/dashboard/

> Vaadin is mostly used for building business applications that look really good and work across all devices.

Click around in dashboard, show graphs, tables etc. Show it on different screensizes by resizing the browser.

> Vaadin consists of hundreds of widgets that have a clear Java API from a table to graphs and menus. The beauty of it is that the user interacts with an HTML5 app and the communication is automated. 

That's the end of the 1 minute pitch. Now switch over to them – look at them and listen.

> What IDE are you using yourself? Ok, excellent – let's see it in action.

Open up the IDE that they were using; IDEA or Eclipse

run **git clean** (get you to the starting point) and open the packages in the IDE to show the files in the project

> As you can see there is a service and a UI. We're running this on Spring-boot (and thus have an Application class) but you can use any application server like jetty, tomcat, websphere or wildfly.

> Maybe you could try it. Just start this app to see what it looks like.

**Run as Java Application** and open the URL http://localhost:8888/ in Chrome and **Give the keyboard to the customer**

> If you compare MyUI.java's content to what you see in Chrome you see how it works. The UI is here built in Java-code. As you can see it's fairly simple. We have two TextFields and a button and then we have a Spring autowired backend-service.

> Try it out. Clicking on the button doesn't do anything yet.

> Please add a ClickListener to the button that calls the back-end when the user clicks on it.

Help them by suggesting to Autocomplete or opening up Sampler on the button http://demo.vaadin.com/sampler/#ui/interaction/button

When done:

> The simple component-model with the well designed databinding and listener model makes it 50% faster to develop because you don't need to write so many lines of code.

Open up Chrome with the app

> That was easy! If you type in your email address you'll get links to a few video tutorials to get started with Vaadin.

> All of this is open source and free to use in any way that you want! 

> We make our money by building even more awesome tools such as a visual Designer for Vaadin Framework and consulting and support.
> The fun part however starts when you start designing your UIs. Do you want to see how to simply drag and drop your UI in place even faster?

