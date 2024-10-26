package com.example.Library.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Loan {

    /* Loan Identification */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanId;

    /* Loan */
    private int loanStudentId;
    private int loanBookId;

    /* Loan Dates */
    private LocalDate loanDateOfLoan;
    private LocalDate loanDateOfReturn;

    /* Return */
    private boolean loanHasExpired;
    private int loanFineId;

    /* All args constructor */
    public Loan(int loanId, int loanStudentId, int loanBookId, LocalDate loanDateOfLoan, LocalDate loanDateOfReturn, boolean loanHasExpired, int loanFineId) {
        this.loanId = loanId;
        this.loanStudentId = loanStudentId;
        this.loanBookId = loanBookId;
        this.loanDateOfLoan = loanDateOfLoan;
        this.loanDateOfReturn = loanDateOfReturn;
        this.loanHasExpired = loanHasExpired;
        this.loanFineId = loanFineId;
    }

    /* No args constructor */
    public Loan() {
    }

    /* Getters */
    public int getLoanId() {
        return loanId;
    }

    public int getLoanStudentId() {
        return loanStudentId;
    }

    public int getLoanBookId() {
        return loanBookId;
    }

    public LocalDate getLoanDateOfLoan() {
        return loanDateOfLoan;
    }

    public LocalDate getLoanDateOfReturn() {
        return loanDateOfReturn;
    }

    public boolean isLoanHasExpired() {
        return loanHasExpired;
    }

    public int getLoanFineId() {
        return loanFineId;
    }

    /* Setters */
    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public void setLoanStudentId(int loanStudentId) {
        this.loanStudentId = loanStudentId;
    }

    public void setLoanBookId(int loanBookId) {
        this.loanBookId = loanBookId;
    }

    public void setLoanDateOfLoan(LocalDate loanDateOfLoan) {
        this.loanDateOfLoan = loanDateOfLoan;
    }

    public void setLoanDateOfReturn(LocalDate loanDateOfReturn) {
        this.loanDateOfReturn = loanDateOfReturn;
    }

    public void setLoanHasExpired(boolean loanHasExpired) {
        this.loanHasExpired = loanHasExpired;
    }

    public void setLoanFineId(int loanFineId) {
        this.loanFineId = loanFineId;
    }
}
