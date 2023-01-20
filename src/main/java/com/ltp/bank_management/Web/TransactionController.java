package com.ltp.bank_management.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltp.bank_management.Beans.TransactionRequest;
import com.ltp.bank_management.Service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    TransactionService trasactionService;


    @PostMapping("/")
    public ResponseEntity<HttpStatus> transactionType(@RequestBody TransactionRequest request){
        trasactionService.transactionType(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
