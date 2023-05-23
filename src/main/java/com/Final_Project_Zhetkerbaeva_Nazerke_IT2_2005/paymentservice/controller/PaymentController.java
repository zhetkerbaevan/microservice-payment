package com.Final_Project_Zhetkerbaeva_Nazerke_IT2_2005.paymentservice.controller;

import com.Final_Project_Zhetkerbaeva_Nazerke_IT2_2005.paymentservice.entity.Payment;
import com.Final_Project_Zhetkerbaeva_Nazerke_IT2_2005.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/add")
    public Payment addPayment(@RequestBody Payment payment){
        if (paymentService.getPaymentByUserId(payment.getUserid()) == null){
            paymentService.addPayment(payment);
            System.out.println("payment is unique");
        }
        return payment;
    }

    @GetMapping("/getByUserId/{id}")
    public Payment getPaymentBy(@PathVariable(name="id") Long userid){
        return paymentService.getPaymentByUserId(userid);
    }

}
