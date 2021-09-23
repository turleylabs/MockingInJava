package com.turleylabs.subscriptions;

import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;
import org.mockito.MockedStatic;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.mockito.Mockito.*;

public class RenewalNotificationServiceTest {
    private static final String MESSAGE = "Your subscription is about to expire!";

    private static final List<Subscriber> SUBSCRIBERS = Arrays.asList(
            new Subscriber("Steve", "steve@email.com", LocalDate.of(2023,9,30)),
            new Subscriber("Bob", "bob@email.com", LocalDate.of(2023,10,30)),
            new Subscriber("Sally", "sally@email.com", LocalDate.of(2023,11,30))
    );

    @Test
    public void whenOneSubscriberIsWithin90DaysOfExpirationThenSendEmail() {
        /*
            TODO:
                1. Mock the EmailService
                2. Stub LocalDate.now() to return the date 2023-11-10
                3. Mock the construction of the SubscriberService
                4. Stub the subscriber service to return the SUBSCRIBERS constant
                5. Verify the email service is called with the MESSAGE constant and the subscriber Sally
         */

        EmailService emailService = null;
        RenewalNotificationService renewalNotificationService = new RenewalNotificationService(emailService);
        renewalNotificationService.notifySubscribers();
    }

    @Test
    public void whenThreeSubscribersAreWithin90DaysOfExpirationThenSendEmailToAllThree() {
        /*
            TODO: Same steps as the previous test except for the following
                1. Stub LocalDate.now() to return the date 2023-9-23
                5. Verify the email service is called with the MESSAGE constant and all the subscribers
         */

        EmailService emailService = null;
        RenewalNotificationService renewalNotificationService = new RenewalNotificationService(emailService);
        renewalNotificationService.notifySubscribers();
    }

    @Test
    public void whenNoSubscribersAreWithin90DaysOfExpirationThenDoNotSendEmails() {
        /*
            TODO: Same steps as the previous test except for the following
                1. Stub LocalDate.now() to return the date 2022-1-1
                5. Verify the email service is not called
         */
        EmailService emailService = null;
        RenewalNotificationService renewalNotificationService = new RenewalNotificationService(emailService);
        renewalNotificationService.notifySubscribers();
    }



}
