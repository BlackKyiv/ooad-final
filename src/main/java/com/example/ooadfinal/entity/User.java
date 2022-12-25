package com.example.ooadfinal.entity;

import java.util.List;
import java.util.Set;

public class User {

    String login;
    String password;

    Set<Subscription> subscriptions;
    List<Invoice> invoices;
}
