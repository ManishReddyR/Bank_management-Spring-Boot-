package com.ltp.bank_management.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ltp.bank_management.Entity.Account;

public interface AccountRepository extends CrudRepository<Account,Long>{

    public Account findByAccountnumber(double AccontNumber);

    public Optional<Account> findById(Long id);

}
    
