package com.austine.gymapp.gym_membership.models;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(nullable = false)
    private LocalDate paymentDate;

    @Column(nullable = false)
    private double amount;


    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Member getMember(){
        return member;
    }

    public LocalDate getPaymentDate(){
        return paymentDate;

    }

    public void setPaymentDate(LocalDate paymentDate){
        this.paymentDate = paymentDate;  
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

}
