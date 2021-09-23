package com.turleylabs.subscriptions;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class RenewalNotificationService {

    private SubscriberService subscriberService;
    private EmailService emailService;

    public RenewalNotificationService(EmailService emailService) {
        this.emailService = emailService;
        this.subscriberService = new SubscriberService();
    }

    public void notifySubscribers() {
        List<Subscriber> subscribers = this.subscriberService.getSubscribers();
        List<Subscriber> subscribersToEmail = subscribers.stream()
                .filter(s -> s.getExpirationDate().isAfter(LocalDate.now()) && s.getExpirationDate().isBefore(LocalDate.now().plusDays(90)))
                .collect(toList());

        if (!subscribersToEmail.isEmpty()) {
            this.emailService.sendMessage("Your subscription is about to expire!", subscribersToEmail);
        }
    }

}
