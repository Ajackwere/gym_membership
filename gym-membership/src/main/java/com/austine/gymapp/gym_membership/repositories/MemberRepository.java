package com.austine.gymapp.gym_membership.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.austine.gymapp.gym_membership.models.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
