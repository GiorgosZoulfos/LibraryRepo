package com.example.Library.Controller;

import com.example.Library.Entities.Loan;
import com.example.Library.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class LoanController {

    private LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    /* ****************************************************** */
    /* ******************** GET GROUP *********************** */
    /* ****************************************************** */
    @GetMapping(path = "/loan")
    public List<Loan> getAllLoans(){
        return loanService.getAllLoans();
    }

    @GetMapping(path = "/loan/{loanId}")
    public Optional<Loan> getLoanById(@PathVariable(name = "loanId") int loanId){
        return loanService.getLoanById(loanId);
    }

    /* ****************************************************** */
    /* ******************** POST GROUP ********************** */
    /* ****************************************************** */
    @PostMapping(path = "/loan")
    public HttpStatus postNewLoan(@RequestBody Loan loan){
        loanService.saveNewLoan(loan);
        return HttpStatus.CREATED;
    }
}
