package com.devcolibri.dataexam.repository;

import com.devcolibri.dataexam.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BankRepository extends JpaRepository<Bank, Long> {
}
