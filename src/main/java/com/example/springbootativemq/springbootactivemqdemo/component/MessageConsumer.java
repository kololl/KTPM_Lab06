package com.example.springbootativemq.springbootactivemqdemo.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.springbootativemq.springbootactivemqdemo.model.SystemMessage;

/**
 *
 * @author AJ Catambay of Bridging Code
 *
 */
@Component
public class MessageConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "bridgingcode-queue")
    public void messageListener(SystemMessage systemMessage) {
        LOGGER.info("Message received! {}", systemMessage);
    }
}
