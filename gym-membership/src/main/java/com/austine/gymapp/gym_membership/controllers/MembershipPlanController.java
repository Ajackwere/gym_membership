package com.austine.gymapp.gym_membership.controllers;

import com.austine.gymapp.gym_membership.models.MembershipPlan;
import com.austine.gymapp.gym_membership.services.MembershipPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/membership-plans")
public class MembershipPlanController {

    @Autowired
    private MembershipPlanService membershipPlanService;

    @PostMapping
    public ResponseEntity<MembershipPlan> createMembershipPlan(@RequestBody MembershipPlan membershipPlan) {
        MembershipPlan newPlan = membershipPlanService.createMembershipPlan(membershipPlan);
        return ResponseEntity.ok(newPlan);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MembershipPlan> getMembershipPlanById(@PathVariable Long id) {
        MembershipPlan plan = membershipPlanService.getMembershipPlanById(id);
        return ResponseEntity.ok(plan);
    }

    @GetMapping
    public ResponseEntity<List<MembershipPlan>> getAllMembershipPlans() {
        List<MembershipPlan> plans = membershipPlanService.getAllMembershipPlans();
        return ResponseEntity.ok(plans);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MembershipPlan> updateMembershipPlan(@PathVariable Long id, @RequestBody MembershipPlan membershipPlan) {
        MembershipPlan updatedPlan = membershipPlanService.updateMembershipPlan(id, membershipPlan);
        return ResponseEntity.ok(updatedPlan);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMembershipPlan(@PathVariable Long id) {
        membershipPlanService.deleteMembershipPlan(id);
        return ResponseEntity.noContent().build();
    }
}
