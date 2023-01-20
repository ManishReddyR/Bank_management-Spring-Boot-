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

import com.ltp.bank_management.Entity.Account;
import com.ltp.bank_management.Service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/add")
    public ResponseEntity<Account> addAccount(@RequestBody Account account){
        return new ResponseEntity<>(account, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<HttpStatus> deleteAccount(@PathVariable Long id){
        accountService.deleteAccount(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/balance")
    public ResponseEntity<HttpStatus> getBalance(@PathVariable double accountNumber){
        accountService.getBalance(accountNumber);
        return new ResponseEntity<>(HttpStatus.OK);
    } 
}
