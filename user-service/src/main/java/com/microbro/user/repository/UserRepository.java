package com.microbro.user.repository;

import com.microbro.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Здесь можно добавить дополнительные методы для работы с User
    User findByUsername(String username);
}
