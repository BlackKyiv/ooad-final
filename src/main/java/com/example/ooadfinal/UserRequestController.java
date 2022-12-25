package com.example.ooadfinal;

import com.example.ooadfinal.model.Card;
import com.example.ooadfinal.service.UserRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserRequestController {

    @Autowired
    UserRequestService userRequestService;

    @PostMapping("/subscribeFor/{tariffId}")
    public void subscribe(@PathVariable String tariffId, @ModelAttribute Card card) {

    }

    @PostMapping("/unsubscribeFrom/{tariffId}")
    public void unsubscribe(@PathVariable String tariffId) {

    }

    @PostMapping("/payForInvoice/{invoiceId}")
    public void payForInvoice(@PathVariable String invoiceId, @ModelAttribute Card card){

    }




}
