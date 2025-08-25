package com.sutherland.loanService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sutherland.loanService.entity.Loan;

public interface LoanServiceRepo extends JpaRepository<Loan, String> {
}
