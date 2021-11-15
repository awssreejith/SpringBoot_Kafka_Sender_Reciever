# SpringBoot_Kafka_Sender_Reciever
This implementation shows how to use Spring cloud stream with Kafka for sending and receiving messages


In this implementation we will have two services

 - sender

 - reciever
 
* The sender will send two types on messages to reciever. The two types of messages are sent through two kafka topics

* For a string message the topic used is  --> Sreejith_Topic_11

* For an object type message [player object] the topic used is  --> Sreejith_Topic_22

* The reciever listens to these two different topics and simply print the output

* To send a message to first topic [string type message] issue the below command

	curl -X PUT http://localhost:8090/sender/Astala_Vista_Baby2

* To send a message to second topic [Player type message] issue the below command

	curl -H "Content-Type: application/json" -X POST http://localhost:8090/sender/player -d "{\"name\":\"Virat Kohli\",\"country\":\"India\",\"age\":\"33\",\"isCaptain\":\"true\"}"
	
Note: Please refer the Note file for further details
