package com.sreejith.sender;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.integration.annotation.Router;
import org.springframework.messaging.MessageChannel;

public interface MyMessagingInterface {

    @Output("Sreejith_Topic_11")
    MessageChannel sendMessage1();

    @Output("Sreejith_Topic_22")
    MessageChannel sendMessage2();
}
