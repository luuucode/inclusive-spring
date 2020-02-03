package com.uscraft.domain.spi.service;


import com.uscraft.domain.spi.MessageServiceProvider;

public class PushNotificationServiceProvider implements MessageServiceProvider {
    @Override
    public void sendMessage(String message) {
        System.out.println("sending push with message =" + message);
    }
}
