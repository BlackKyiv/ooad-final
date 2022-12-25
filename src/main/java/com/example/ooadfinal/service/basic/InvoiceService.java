package com.example.ooadfinal.service.basic;

import com.example.ooadfinal.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    @Autowired
    InvoiceRepository repository;

}
