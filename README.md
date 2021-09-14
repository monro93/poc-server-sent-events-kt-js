# POC - server sent events kotlin + js

### Description

This repository is a proof of concept to try the server sent events HTTP standard. It consits in the following parts:

* BackEnd
  * Endpoint to subscribe to the messages [ServerSendEventController](src/main/kotlin/com/example/poc/ServerSendEventController.kt)
  * Endpoint to trigger an Spring Event that will call the emitter [RegisterEventController](src/main/kotlin/com/example/poc/RegisterEventController.kt)
  * Endpoint that renders a simple page with some js [FEController](src/main/kotlin/com/example/poc/FEController.kt)
* Frontend
  * Simplest [html file](src/main/resources/templates/index.html) as possible
  * JS to handle the server sent events [eventListener.js](src/main/resources/static/eventListener.js)

### Installation
````mvn clean install````

### Starting the app
```mvn spring-boot:run```

### Usage
Go to [localhost:3099](http://localhost:3099)  
Click on the button Connect, a call to /emitter would be done. After click on RegisterEvent and a GET call without response content to /register-event will be done.  Notice how the output is being updated without any petition from the FE.
