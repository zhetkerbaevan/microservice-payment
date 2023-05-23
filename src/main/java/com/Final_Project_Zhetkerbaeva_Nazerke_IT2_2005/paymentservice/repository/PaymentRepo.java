package com.Final_Project_Zhetkerbaeva_Nazerke_IT2_2005.paymentservice.repository;

import com.Final_Project_Zhetkerbaeva_Nazerke_IT2_2005.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Long> {
    Payment getPaymentByUserid(Long userid);
}
