package com.Final_Project_Zhetkerbaeva_Nazerke_IT2_2005.paymentservice.controller;

import com.Final_Project_Zhetkerbaeva_Nazerke_IT2_2005.paymentservice.entity.Payment;
import com.Final_Project_Zhetkerbaeva_Nazerke_IT2_2005.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/add")
    public Payment addPayment(@RequestBody Payment payment){
        return paymentService.addPayment(payment);
    }

    @GetMapping("/getByUserId/{id}")
    public Payment getPaymentBy(@PathVariable(name="id") Long userid){
        System.out.println(userid);
        return paymentService.getPaymentByUserId(userid);
    }
}
