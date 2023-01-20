package com.ltp.bank_management.Service;

import com.ltp.bank_management.Beans.AddCoustomerRequest;
import com.ltp.bank_management.Entity.Coustomer;

public interface CoustomerService {

    public Coustomer saveCoustomer(Coustomer coustomer);
    public void updaCoustomer(AddCoustomerRequest request);
    public void deleteCoustomer(Long id);
    public Coustomer getCoustomer(Long id);
}
