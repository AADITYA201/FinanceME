package com.financeme.accountservice.service;

import com.financeme.accountservice.entity.Account;
import com.financeme.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(Long accountNo, Account updatedAccount) {
        Optional<Account> optional = accountRepository.findById(accountNo);
        if (optional.isPresent()) {
            Account existing = optional.get();
            existing.setAccountHolder(updatedAccount.getAccountHolder());
            existing.setPolicyType(updatedAccount.getPolicyType());
            existing.setBalance(updatedAccount.getBalance());
            return accountRepository.save(existing);
        } else {
            throw new RuntimeException("Account not found with ID: " + accountNo);
        }
    }

    public Account viewPolicy(Long accountNo) {
        return accountRepository.findById(accountNo)
                .orElseThrow(() -> new RuntimeException("Account not found"));
    }

    public void deletePolicy(Long accountNo) {
        accountRepository.deleteById(accountNo);
    }
}
