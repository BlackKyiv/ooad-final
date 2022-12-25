package com.example.ooadfinal;

import com.example.ooadfinal.entity.Card;
import com.example.ooadfinal.service.UserRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRequestController {

    @Autowired
    UserRequestService userRequestService;

    @PutMapping("/subscribeFor/{tariffId}")
    public void subscribe(@PathVariable String tariffId, @ModelAttribute Card card) {

    }

    @PutMapping("/unsubscribeFrom/{tariffId}")
    public void unsubscribe(@PathVariable String tariffId) {

    }

    @PutMapping("/payForInvoice/{invoiceId}")
    public void payForInvoice(@PathVariable String invoiceId, @ModelAttribute Card card) {

    }

}
