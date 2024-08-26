package com.austine.gymapp.gym_membership.services;

import com.austine.gymapp.gym_membership.models.Subscription;
import com.austine.gymapp.gym_membership.repositories.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    public Subscription createSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    public Subscription getSubscriptionById(Long id) {
        Optional<Subscription> subscription = subscriptionRepository.findById(id);
        return subscription.orElseThrow(() -> new RuntimeException("Subscription not found with id: " + id));
    }

    public List<Subscription> getAllSubscriptions() {
        return subscriptionRepository.findAll();
    }

    public Subscription updateSubscription(Long id, Subscription subscription) {
        Subscription existingSubscription = getSubscriptionById(id);
        existingSubscription.setMember(subscription.getMember());
        existingSubscription.setMembershipPlan(subscription.getMembershipPlan());
        existingSubscription.setStartDate(subscription.getStartDate());
        existingSubscription.setEndDate(subscription.getEndDate());
        existingSubscription.setActive(subscription.isActive());
        return subscriptionRepository.save(existingSubscription);
    }

    public void deleteSubscription(Long id) {
        subscriptionRepository.deleteById(id);
    }
}
