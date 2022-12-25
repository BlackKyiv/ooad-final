package com.example.ooadfinal.service;

import com.example.ooadfinal.service.basic.InvoiceService;
import com.example.ooadfinal.service.basic.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


/**
 * Service sets scheduled tasks for updating statuses, generating new invoices and trying to pay for them
 */
@Service
public class SubscriptionControlService {

    @Autowired
    PaymentService paymentService;

    @Autowired
    InvoiceService invoiceService;

    @Autowired
    SubscriptionService subscriptionService;


    /**
     * Depending on the date of last payment for each subscription and interval in its tariff,
     * this method every day at 6 am generates invoices and instantly tries to pay them for each subscription.
     * If it fails to pay using user's card (or card is not specified), invoice will be saved as not paid one.
     */
    @Scheduled(cron = "0 6 * * *")
    public void generateInvoicesAndTryToPay() {

    }

    /**
     * Every day at 7 am this method will try to pay all not paid invoices, if the card is specified inside.
     */
    @Scheduled(cron = "0 7 * * *")
    public void tryToPayAllNotPaidInvoice() {

    }

    /**
     * Every day at 8 am this method will search for all subscription with last payment date more than it's interval +5 days
     * If it finds one, the status of subscription will be set as blocked.
     */
    @Scheduled(cron = "0 8 * * *")
    public void blockAllUnpaidSubscriptions() {

    }


}
