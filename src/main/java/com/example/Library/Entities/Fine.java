package com.example.Library.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fine {

    /* Fine Identification */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fineId;

    /* Fine Info */
    private int fineOnStudent;
    private int fineForBook;
    private double fineAmount;
    private boolean fineIsPaid;

    /* All args constructors */
    public Fine(int fineId, int fineOnStudent, int fineForBook, double fineAmount, boolean fineIsPaid) {
        this.fineId = fineId;
        this.fineOnStudent = fineOnStudent;
        this.fineForBook = fineForBook;
        this.fineAmount = fineAmount;
        this.fineIsPaid = fineIsPaid;
    }

    /* No args constructor */
    public Fine() {
    }

    /* Getters */
    public int getFineId() {
        return fineId;
    }

    public int getFineOnStudent() {
        return fineOnStudent;
    }

    public int getFineForBook() {
        return fineForBook;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public boolean isFineIsPaid() {
        return fineIsPaid;
    }

    /* Setters */
    public void setFineId(int fineId) {
        this.fineId = fineId;
    }

    public void setFineOnStudent(int fineOnStudent) {
        this.fineOnStudent = fineOnStudent;
    }

    public void setFineForBook(int fineForBook) {
        this.fineForBook = fineForBook;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public void setFineIsPaid(boolean fineIsPaid) {
        this.fineIsPaid = fineIsPaid;
    }
}
