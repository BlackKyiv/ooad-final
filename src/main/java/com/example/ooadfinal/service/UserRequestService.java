package com.example.ooadfinal.service;

import com.example.ooadfinal.entity.Card;
import com.example.ooadfinal.service.basic.InvoiceService;
import com.example.ooadfinal.service.basic.TariffService;
import com.example.ooadfinal.service.basic.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service used for handling users request from UserRequestController
 */
@Service
public class UserRequestService {

    @Autowired
    TariffService tariffService;

    @Autowired
    UserService userService;

    @Autowired
    InvoiceService invoiceService;

    @Autowired
    PaymentService paymentService;

    public void subscribeUserTo(String userId, String tariffId, boolean automaticPay, Card card) {
    }

    public void unsubscribeUserFrom(String userId, String tariffId) {
    }

    public void payForInvoiceWithCard(Card card, String invoiceId) {
    }

}
