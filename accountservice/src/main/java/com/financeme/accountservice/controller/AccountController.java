package com.financeme.accountservice.controller;

import com.financeme.accountservice.entity.Account;
import com.financeme.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/createAccount")
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.createAccount(account));
    }

    @PutMapping("/updateAccount/{accountNo}")
    public ResponseEntity<Account> updateAccount(@PathVariable Long accountNo, @RequestBody Account account) {
        return ResponseEntity.ok(accountService.updateAccount(accountNo, account));
    }

    @GetMapping("/viewPolicy/{accountNo}")
    public ResponseEntity<Account> viewPolicy(@PathVariable Long accountNo) {
        return ResponseEntity.ok(accountService.viewPolicy(accountNo));
    }

    @DeleteMapping("/deletePolicy/{accountNo}")
    public ResponseEntity<String> deletePolicy(@PathVariable Long accountNo) {
        accountService.deletePolicy(accountNo);
        return ResponseEntity.ok("Account deleted successfully.");
    }
}
