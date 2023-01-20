package com.ltp.bank_management.Beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionRequest {

    private double accountNumber;
    private double reciverAccountNumber;
    private double Amount;
    private double reciverAmount;
    public String transactionType;
    
}
