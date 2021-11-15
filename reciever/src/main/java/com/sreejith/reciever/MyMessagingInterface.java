package com.sreejith.reciever;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MyMessagingInterface {

    @Input("Sreejith_Topic_11")
    SubscribableChannel recieveMessage1();

    @Input("Sreejith_Topic_22")
    SubscribableChannel recieveMessage2();
}
