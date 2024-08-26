package com.austine.gymapp.gym_membership.services;
import com.austine.gymapp.gym_membership.models.Member;
import org.springframework.beans.factory.annotation.Autowired;
import com.austine.gymapp.gym_membership.repositories.MemberRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Member createMember(Member member){
        return memberRepository.save(member);
    }

    public Member getMemberById(Long id){
        Optional<Member> member = memberRepository.findById(id);
        return member.orElseThrow(() -> new RuntimeException("Member not found with id:" + id));
    }

    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }

    public Member updateMember(Long id, Member updatedMember) {
        Member member = getMemberById(id);
        member.setFirstName(updatedMember.getFirstName());
        member.setLastName(updatedMember.getLastName());
        member.setEmail(updatedMember.getEmail());
        member.setPhoneNumber(updatedMember.getPhoneNumber());
        member.setDateOfBirth(updatedMember.getDateOfBirth());
        member.setAddress(updatedMember.getAddress());
        member.setMembershipType(updatedMember.getMembershipType());
        member.setMembershipExpirationDate(updatedMember.getMembershipExpirationDate());
        member.setPaymentHistory(updatedMember.getPaymentHistory());
        return memberRepository.save(member);
    }

    public void deleteMember(Long id) {
        Member member = getMemberById(id);
        memberRepository.delete(member);
    }
}
