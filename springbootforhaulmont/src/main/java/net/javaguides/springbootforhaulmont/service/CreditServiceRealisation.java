package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Client;
import net.javaguides.springbootforhaulmont.model.Credit;
import net.javaguides.springbootforhaulmont.repository.ClientRepository;
import net.javaguides.springbootforhaulmont.repository.CreditRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class CreditServiceRealisation implements CreditServiceInterface {
    
    private final CreditRepository creditRepository;

    @Autowired
    public CreditServiceRealisation(CreditRepository creditRepository) {
        this.creditRepository = creditRepository;
    }

    @Override
    public Credit findCreditById(UUID id) {
        return creditRepository.getOne(id);
    }

    @Override
    public List<Credit> findAllCredit() {
        return creditRepository.findAll();
    }

    @Override
    public void deleteCreditById(UUID id) {
    creditRepository.deleteById(id);
    }

    @Override
    public Credit saveCredit(Credit credit) {
        return creditRepository.save(credit);
    }
}
