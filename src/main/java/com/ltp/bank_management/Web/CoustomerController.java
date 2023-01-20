package com.ltp.bank_management.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.bank_management.Beans.AddCoustomerRequest;
import com.ltp.bank_management.Entity.Coustomer;
import com.ltp.bank_management.Service.CoustomerService;

@RestController
@RequestMapping("/coustomer")
public class CoustomerController {

    @Autowired
    CoustomerService coustomerService;

    @PostMapping("/add")
    public ResponseEntity<Coustomer> addCoustomer(@RequestBody Coustomer coustomer ){
        return new ResponseEntity<>(coustomerService.saveCoustomer(coustomer),HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<HttpStatus> updateCoustomer(@RequestBody AddCoustomerRequest request){
        coustomerService.updaCoustomer(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<HttpStatus> deleteCoustomer(@PathVariable long Id ){
        coustomerService.deleteCoustomer(Id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/get")
    public ResponseEntity<Coustomer> getCoustomer(@PathVariable Long id){
        return new ResponseEntity<>(coustomerService.getCoustomer(id), HttpStatus.OK);
    }

}
