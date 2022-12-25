package com.example.ooadfinal.service.basic;

import com.example.ooadfinal.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {
    @Autowired
    SubscriptionRepository repository;


}
