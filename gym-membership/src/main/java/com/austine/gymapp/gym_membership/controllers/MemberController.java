package com.austine.gymapp.gym_membership.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.austine.gymapp.gym_membership.services.MemberService;

import java.util.List;
import com.austine.gymapp.gym_membership.models.Member;

@RestController
@RequestMapping("api/members")
public class MemberController {

    @Autowired
    private MemberService memberService;


    @PostMapping
    public ResponseEntity<Member> createMember(@RequestBody Member member){
        Member newMember = memberService.createMember(member);
        return ResponseEntity.ok(newMember);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Member> getMemberById(@PathVariable Long id){
        Member member = memberService.getMemberById(id);
        return ResponseEntity.ok(member);
    }

    @GetMapping
    public ResponseEntity<List<Member>> getAllMembers(){
        List<Member> members = memberService.getAllMembers();
        return ResponseEntity.ok(members);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Member> updateMember(@PathVariable Long id, @RequestBody Member member){
        Member updatedMember = memberService.updateMember(id, member);
        return ResponseEntity.ok(updatedMember);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMember(@PathVariable Long id){
        memberService.deleteMember(id);
        return ResponseEntity.noContent().build();
    }
}
