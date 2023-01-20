package com.ltp.bank_management.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltp.bank_management.Beans.AddCoustomerRequest;
import com.ltp.bank_management.Entity.Coustomer;
import com.ltp.bank_management.Repository.CoustomerRepository;

@Service
public class CoustomerServiceimpl implements CoustomerService {
    
    @Autowired
    CoustomerRepository coustomerRepository;

    @Override
    public Coustomer saveCoustomer(Coustomer coustomer) {
        return coustomerRepository.save(coustomer);
    }

    @Override
    public void updaCoustomer(AddCoustomerRequest request) {
        Coustomer coustomer=coustomerRepository.findByFirstName(request.getFirstname());
        coustomer.setFirstname(request.getFirstname());
        coustomer.setLastname(request.getLastname());
        coustomer.setAddress(request.getAddress());
        coustomer.setIdentity(request.getIdentity());
        coustomerRepository.save(coustomer);
    }

    @Override
    public void deleteCoustomer(Long id) {
        coustomerRepository.deleteById(id);        
    }

    @Override
    public Coustomer getCoustomer(Long id) {
        return coustomerRepository.findById(id).get();
    }




    
}
