package com.austine.gymapp.gym_membership.controllers;

import com.austine.gymapp.gym_membership.services.SubscriptionService;
import com.austine.gymapp.gym_membership.models.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;


    @PostMapping
    public ResponseEntity<Subscription> createSubscription(@RequestBody Subscription subscription){
        Subscription newSubscription = subscriptionService.createSubscription(subscription);

        return ResponseEntity.ok(newSubscription);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subscription> getSubscriptionById(@PathVariable Long id){
        Subscription subscription = subscriptionService.getSubscriptionById(id);

        return ResponseEntity.ok(subscription);
    }

    @GetMapping()
    public ResponseEntity<List<Subscription>> getAllSubscriptions(){
        List<Subscription> subscriptions = subscriptionService.getAllSubscriptions();
        return ResponseEntity.ok(subscriptions);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Subscription> updateSubscription(@PathVariable Long id, @RequestBody Subscription subscription){
        Subscription updatedSub = subscriptionService.updateSubscription(id, subscription);
        return ResponseEntity.ok(updatedSub);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSubscription(@PathVariable Long id){
        subscriptionService.deleteSubscription(id);
        return ResponseEntity.noContent().build();
    }
}
