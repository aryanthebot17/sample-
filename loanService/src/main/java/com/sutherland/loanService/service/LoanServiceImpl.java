package com.sutherland.loanService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sutherland.loanService.entity.Loan;
import com.sutherland.loanService.repo.LoanServiceRepo;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    LoanServiceRepo repo;

    @Override
    public void addDetails(Loan loan) {
        repo.save(loan);
    }

    @Override
    public List<Loan> getAll() {
        return repo.findAll();
    }

    @Override
    public CreditScore getCreditScoreByPancard(String pancard) {
        Optional<CreditScore> score = repo.findById(pancard);
        return score.get();
    }
}
