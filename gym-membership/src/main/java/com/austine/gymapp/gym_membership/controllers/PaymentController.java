package com.austine.gymapp.gym_membership.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.austine.gymapp.gym_membership.models.Payment;
import com.austine.gymapp.gym_membership.services.PaymentService;

import java.util.List;


@RestController
@RequestMapping("api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping()
    public ResponseEntity<List<Payment>> getAllPayment(){
        List<Payment> payments = paymentService.getAllPayments();
        return ResponseEntity.ok(payments);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);

        return ResponseEntity.ok(payment);
    }

    @PostMapping()
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment){
        Payment newPayment = paymentService.createPayment(payment);
        return ResponseEntity.ok(payment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long id){
        paymentService.deletePayment(id);

        return ResponseEntity.noContent().build();
    }
}
