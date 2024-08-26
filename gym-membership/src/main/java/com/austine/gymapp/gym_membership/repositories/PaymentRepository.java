package com.austine.gymapp.gym_membership.repositories;

import com.austine.gymapp.gym_membership.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
