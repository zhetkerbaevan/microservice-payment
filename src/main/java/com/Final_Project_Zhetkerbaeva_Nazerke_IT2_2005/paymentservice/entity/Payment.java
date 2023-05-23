package com.Final_Project_Zhetkerbaeva_Nazerke_IT2_2005.paymentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "payment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long payment_id;

    @Column(name="card_number")
    private String card_number;

    @Column(name="expiration")
    private String expiration;

    @Column(name="card_v_number")
    private int card_v_number;

    @Column(name="amount")
    private int amount;

    @Column(name="userid")
    private Long userid;

}
