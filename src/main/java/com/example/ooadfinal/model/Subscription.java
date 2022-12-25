package com.example.ooadfinal.model;

import java.util.Date;

public class Subscription {

    String id;

    User user;
    Tariff tariff;
    Date lastPayment;
    /**
     * Can be set to null if payment option is manual
     */
    Card card;
    boolean blocked;
}
