package com.devcolibri.dataexam.repository;

import com.devcolibri.dataexam.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
