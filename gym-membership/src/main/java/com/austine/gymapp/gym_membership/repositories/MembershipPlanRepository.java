package com.austine.gymapp.gym_membership.repositories;

import com.austine.gymapp.gym_membership.models.MembershipPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipPlanRepository extends JpaRepository<MembershipPlan, Long> {
}
