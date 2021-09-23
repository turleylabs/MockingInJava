package com.turleylabs.subscriptions;

import java.util.List;

public interface EmailService {
    public void sendMessage(String message, List<Subscriber> emails);
}
