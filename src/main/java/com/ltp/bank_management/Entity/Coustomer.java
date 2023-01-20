package com.ltp.bank_management.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "coustomer")
@Getter
@Setter
public class Coustomer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name ="first_name" , nullable = false)
    private String firstname;

    @Column(name ="last_name" , nullable = false)
    private String lastname;

    @Column(name ="address" , nullable = false)
    private String address;

    @Column(name ="identity" , nullable = false)
    private String identity;
    

 }