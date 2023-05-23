package com.Final_Project_Zhetkerbaeva_Nazerke_IT2_2005.paymentservice.service;

import com.Final_Project_Zhetkerbaeva_Nazerke_IT2_2005.paymentservice.entity.Payment;
import com.Final_Project_Zhetkerbaeva_Nazerke_IT2_2005.paymentservice.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepo paymentRepo;

    public Payment addPayment(Payment payment){
        return paymentRepo.save(payment);
    }

    public Payment updatePayment(Payment payment){
        return paymentRepo.save(payment);
    }

    public Payment getPaymentByUserId(Long userid){
        return paymentRepo.getPaymentByUserid(userid);
    }

}
