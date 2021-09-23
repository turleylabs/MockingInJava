package com.turleylabs.subscriptions;

import java.util.List;

public class SubscriberService {
    public List<Subscriber> getSubscribers() {
        throw new RuntimeException("Oops, can't be called in a test");
    }
}
