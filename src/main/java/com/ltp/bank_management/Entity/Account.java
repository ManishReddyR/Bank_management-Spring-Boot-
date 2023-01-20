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
@Table(name = "accounts")
@Getter
@Setter
public class Account {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    @Column(name = "account_number")
    private double accountnumber;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "balance")
    private double balance;

}
