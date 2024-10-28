package com.example.Library.Service;

import com.example.Library.Entities.Loan;
import com.example.Library.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    private LoanRepository loanRepository;

    @Autowired
    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    /* Get info for all loans */
    public List<Loan> getAllLoans(){
        return loanRepository.findAll();
    }

    /* Get info for loan by id */
    public Optional<Loan> getLoanById(int loanId){
        return loanRepository.findById(loanId);
    }

    /* Save new loan in database */
    public void saveNewLoan(Loan loan){
        loanRepository.save(loan);
    }
}
