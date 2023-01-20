package com.ltp.bank_management.Service;

import com.ltp.bank_management.Beans.AddAccountRequest;
import com.ltp.bank_management.Entity.Account;

public interface AccountService {

    public void addAccount(AddAccountRequest request,Account account);

    public void deleteAccount(Long id);

    public double getBalance(double accountnumber);

    
}
