package com.financeme.accountservice.repository;

import com.financeme.accountservice.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    // You can define custom queries if needed, for now basic CRUD is enough
}
