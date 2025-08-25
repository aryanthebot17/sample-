package com.sutherland.loanService.service;

import java.util.List;

import com.sutherland.loanService.entity.Loan;

public interface LoanService {
    void addDetails(Loan loan);
    List<Loan> getAll();
    CreditScore getCreditScoreByPancard(String pancard); // Assuming CreditScore is defined
}
