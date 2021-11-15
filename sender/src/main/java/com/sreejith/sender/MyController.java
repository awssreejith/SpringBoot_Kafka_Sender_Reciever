package com.sreejith.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/sender")
@EnableBinding(MyMessagingInterface.class)
public class MyController {

    @Autowired
    MyMessagingInterface myMessagingInterface;

    @PutMapping("/{message}")
    public ResponseEntity<String> sendMessage(@PathVariable("message") String inputMessage)
    {

       Message<String> myMessage = MessageBuilder.withPayload(inputMessage).build();
       myMessagingInterface.sendMessage1().send(myMessage);
       return ResponseEntity.status(OK).body("Message Sent");
    }

    @PostMapping("/player")
    public ResponseEntity<String> sendMessage(@RequestBody Player player)
    {
        Message<Player> myMessage = MessageBuilder.withPayload(player).build();
        myMessagingInterface.sendMessage2().send(myMessage);
        return ResponseEntity.status(OK).body("Message Sent");
    }
}
