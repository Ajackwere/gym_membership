package com.austine.gymapp.gym_membership.services;

import com.austine.gymapp.gym_membership.models.MembershipPlan;
import com.austine.gymapp.gym_membership.repositories.MembershipPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class MembershipPlanService {
    @Autowired
    private MembershipPlanRepository membershipPlanRepository;


    public MembershipPlan createMembershipPlan(MembershipPlan membershipPlan){
        return membershipPlanRepository.save(membershipPlan);
    }

    public MembershipPlan getMembershipPlanById(Long id){
        Optional<MembershipPlan> plan = membershipPlanRepository.findById(id);
        return plan.orElseThrow(() -> new RuntimeException("Membership plan not found with id:" + id));
    }

    public List<MembershipPlan> getAllMembershipPlans(){
        return membershipPlanRepository.findAll();
    }

    public void deleteMembershipPlan(Long id){
        MembershipPlan plan = getMembershipPlanById(id);
        membershipPlanRepository.delete(plan);
    }
    public MembershipPlan updateMembershipPlan(Long id, MembershipPlan updatedPlan) {
        MembershipPlan plan = getMembershipPlanById(id);
        plan.setName(updatedPlan.getName());
        plan.setDescription(updatedPlan.getDescription());
        plan.setDurationInDays(updatedPlan.getDurationInDays());
        plan.setPrice(updatedPlan.getPrice());
        return membershipPlanRepository.save(plan);
    }
}
