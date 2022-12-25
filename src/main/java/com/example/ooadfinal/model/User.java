package com.example.ooadfinal.model;

import java.util.List;
import java.util.Set;

public class User {

    String login;
    String password;

    Set<Subscription> subscriptions;
    List<Invoice> invoices;
}
