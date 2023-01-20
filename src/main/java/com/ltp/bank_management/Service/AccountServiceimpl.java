package com.ltp.bank_management.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltp.bank_management.Beans.AddAccountRequest;
import com.ltp.bank_management.Entity.Account;
import com.ltp.bank_management.Entity.Coustomer;
import com.ltp.bank_management.Repository.AccountRepository;
import com.ltp.bank_management.Repository.CoustomerRepository;

@Service
public class AccountServiceimpl implements AccountService {
    
    @Autowired
    AccountRepository accountRepository;

    @Autowired
    CoustomerRepository coustomerRepository;

    @Override
    public void addAccount( AddAccountRequest request,Account account) {
        Coustomer coustomer=coustomerRepository.findByFirstName(request.getFirstname());
        if(coustomer!=null){
            double account_number =Double.parseDouble(coustomer.getId()) * 10000;
            account.setAccountnumber(account_number);
            accountRepository.save(account);
        }
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);        
    }

    @Override
    public double getBalance(double accountnumber) {
        return accountRepository.findByAccountnumber(accountnumber).getBalance();
    }
}
