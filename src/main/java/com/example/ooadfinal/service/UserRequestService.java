package com.example.ooadfinal.service;

import com.example.ooadfinal.model.Card;
import com.example.ooadfinal.service.basic.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service used for handling users request from UserRequestController
 */
@Service
public class UserRequestService {

    @Autowired
    SubscriptionService subscriptionService;

    @Autowired
    PaymentService paymentService;

    public void registerUser(String[] args) {
    }

    public void deleteUser(String userId) {
    }

    public void subscribeUserTo(String userId, String tariffId, boolean automaticPay, Card card) {
    }

    public void unsubscribeUserFrom(String userId, String tariffId) {
    }

    public void payForInvoiceWithCard(Card card, String invoiceId) {
    }

}
