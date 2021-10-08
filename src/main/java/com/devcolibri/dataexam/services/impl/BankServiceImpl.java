package com.devcolibri.dataexam.services.impl;

import com.devcolibri.dataexam.entity.Bank;
import com.devcolibri.dataexam.repository.BankRepository;
import com.devcolibri.dataexam.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepository bankRepository;

    @Override
    public Bank addBank(Bank bank) {
        Bank savedBank = bankRepository.saveAndFlush(bank); //тут мы сохраняем Bank в БД используя метод saveAndFlush,
        // используя просто save() мы сохраняем запись но после вызова flush данные попадают в БД;

        return savedBank;
    }

    @Override
    public void delete(long id) {
        bankRepository.delete(id);
    }

    @Override
    public Bank getByName(String name) {
        return bankRepository.findByName(name);
    }

    @Override
    public Bank editBank(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    @Override
    public List<Bank> getAll() {
        return bankRepository.findAll();
    }
}
