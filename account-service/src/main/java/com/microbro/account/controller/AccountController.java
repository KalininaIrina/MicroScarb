package com.microbro.account.controller;

import com.microbro.account.model.Account;
import com.microbro.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/create")
    public Account createAccount(@RequestParam Long userId) {
        return accountService.createAccount(userId);
    }

    @GetMapping("/{userId}")
    public Account getAccount(@PathVariable Long userId) {
        return accountService.getAccountByUserId(userId);
    }

    @PutMapping("/update/{userId}")
    public Account updateBalance(@PathVariable Long userId, @RequestParam Double newBalance) {
        return accountService.updateBalance(userId, newBalance);
    }
}
