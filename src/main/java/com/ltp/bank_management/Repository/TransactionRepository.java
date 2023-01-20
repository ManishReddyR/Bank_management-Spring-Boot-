package com.ltp.bank_management.Repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.bank_management.Entity.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction,Long>{
    
}