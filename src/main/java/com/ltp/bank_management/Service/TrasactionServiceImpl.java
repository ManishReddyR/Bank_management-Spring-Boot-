package com.ltp.bank_management.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltp.bank_management.Beans.TransactionRequest;
import com.ltp.bank_management.Costants.Constants;
import com.ltp.bank_management.Entity.Account;
import com.ltp.bank_management.Repository.AccountRepository;
import com.ltp.bank_management.Repository.TransactionRepository;

@Service
public class TrasactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void transactionType(TransactionRequest request) {
        if(request.getTransactionType().equals(Constants.CREDIT)){
            Account account=accountRepository.findByAccountnumber(request.getAccountNumber());
            if(account!=null){
                account.setBalance(account.getBalance()+request.getAmount());
            }
        }

        if(request.getTransactionType().equals(Constants.DEBIT)){
            Account account=accountRepository.findByAccountnumber(request.getAccountNumber());
            if(account!=null){
                account.setBalance(account.getBalance()-request.getAmount());
            }
        }

        if(request.getTransactionType().equals(Constants.ACCOUNTTRANSFER)){
            Account account=accountRepository.findByAccountnumber(request.getAccountNumber());
            Account account2=accountRepository.findByAccountnumber(request.getReciverAccountNumber());
    
            if(account!=null && account2!=null){
                account.setBalance((account.getBalance()-request.getAmount()));
                account2.setBalance(account2.getBalance()+request.getAmount());
            }   
        }
    }
    
}
