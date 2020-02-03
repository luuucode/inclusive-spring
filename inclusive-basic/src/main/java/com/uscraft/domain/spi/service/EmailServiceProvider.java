package com.uscraft.domain.spi.service;

import com.uscraft.domain.spi.MessageServiceProvider;

public class EmailServiceProvider implements MessageServiceProvider {
    @Override
    public void sendMessage(String message) {
        System.out.println("sending email with message =" + message);
    }
}
