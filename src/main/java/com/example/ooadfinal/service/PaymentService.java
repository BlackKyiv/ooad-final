package com.example.ooadfinal.service;

import com.example.ooadfinal.entity.Card;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    /**
     * This method is needed to try to pay specified amount using specified card
     *
     * @param card   contains data needed for payment
     * @param amount is mount of money needed for payment
     * @return true if payment is successful
     */
    public boolean automaticPay(Card card, Double amount) {
        return false;
    }


}
