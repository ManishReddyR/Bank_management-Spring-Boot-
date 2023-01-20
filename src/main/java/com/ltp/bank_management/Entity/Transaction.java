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
@Table(name = "Transaction")
@Getter
@Setter
public class Transaction {

    @Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

    @Column(name = "account_number")
    private double accountNumber;

    @Column(name = "transaction_amount")
    private double transactionAmount;

    @Column(name = "transaction_type")
    private String transactionType;


}
