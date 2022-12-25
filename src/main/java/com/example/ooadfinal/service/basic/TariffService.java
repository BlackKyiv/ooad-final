package com.example.ooadfinal.service.basic;

import com.example.ooadfinal.repository.TariffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TariffService {
    @Autowired
    TariffRepository repository;
}
