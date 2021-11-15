package com.sreejith.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@Component
@EnableBinding(MyMessagingInterface.class)
public class MyController {

    @Autowired
    MyMessagingInterface myMessagingInterface;

    @StreamListener("Sreejith_Topic_11")
    public void receiveMessageFromTopic1(String inputMessage)
    {
        System.out.printf("Message Recieved Is: %s\n",inputMessage);

    }

    @StreamListener("Sreejith_Topic_22")
    public void receiveMessageFromTopic2(Player player)
    {
        System.out.printf("Player Name: %s\n",player.getName());
        System.out.printf("Player Country: %s\n",player.getCountry());
        System.out.printf("Player Age: %s\n",player.getAge());
        System.out.printf("Player is captain: %s\n",player.getCaptain());
    }
}
