package com.microbro.account.service;

import com.microbro.account.model.Account;
import com.microbro.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    // Метод для создания счета
    public Account createAccount(Long userId) {
        Account account = new Account();
        account.setUserId(userId);
        account.setBalance(0.0);
        return accountRepository.save(account);
    }

    // Метод для получения счета по ID пользователя
    public Account getAccountByUserId(Long userId) {
        return accountRepository.findByUserId(userId);
    }

    // Метод для обновления баланса
    public Account updateBalance(Long userId, Double newBalance) {
        Account account = accountRepository.findByUserId(userId);
        if (account != null) {
            account.setBalance(newBalance);
            return accountRepository.save(account);
        }
        return null;
    }
}
