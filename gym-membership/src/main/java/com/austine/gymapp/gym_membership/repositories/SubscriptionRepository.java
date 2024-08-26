package com.austine.gymapp.gym_membership.repositories;

import com.austine.gymapp.gym_membership.models.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
