package com.ltp.bank_management.Repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.bank_management.Entity.Coustomer;

public interface CoustomerRepository extends CrudRepository<Coustomer,Long>{

    public Coustomer findByFirstName(String firstname); 

    public Coustomer findById(long id);

}