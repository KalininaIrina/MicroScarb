package com.microbro.account.repository;

import com.microbro.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUserId(Long userId); // Поиск счета по ID пользователя
}
