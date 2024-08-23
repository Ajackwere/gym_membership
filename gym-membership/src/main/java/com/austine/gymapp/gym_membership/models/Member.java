package com.austine.gymapp.gym_membership.models;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "members")

public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;


    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = true)
    private LocalDate dateOfBirth;

    @Column(nullable = true)
    private String address;


    @Enumerated(EnumType.STRING)
    private MembershipType membershipType;

    private LocalDate membershipExpirationDate;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Payment> paymentHistory;



    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public MembershipType getMembershipType(){
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType){
        this.membershipType = membershipType;
    }

    public LocalDate getMembershipExpirationDate(){
        return membershipExpirationDate;
    }

    public void setMembershipExpirationDate(LocalDate membershipExpirationDate){
        this.membershipExpirationDate = membershipExpirationDate;
    }

    public List<Payment> getPaymentHistory(){
        return paymentHistory;
    }

    public void setPaymentHistory(List<Payment> paymentHistory){
        this.paymentHistory = paymentHistory;
    }

}
