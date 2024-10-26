package com.example.Library.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    /* Book Identification */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    /* Book Info */
    public String bookTitle;
    public String bookDescription;

    /* Book Library - Related Info */
    public boolean bookIsAvailable;
    public boolean bookIsOnLoan;
    public boolean bookIsOnHold;

    /* All args Constructor */
    public Book(int bookId, String bookTitle, String bookDescription, boolean bookIsAvailable, boolean bookIsOnLoan, boolean bookIsOnHold) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookDescription = bookDescription;
        this.bookIsAvailable = bookIsAvailable;
        this.bookIsOnLoan = bookIsOnLoan;
        this.bookIsOnHold = bookIsOnHold;
    }

    /* No args constructor */
    public Book() {
    }

    /* Getters */
    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public boolean isBookIsAvailable() {
        return bookIsAvailable;
    }

    public boolean isBookIsOnLoan() {
        return bookIsOnLoan;
    }

    public boolean isBookIsOnHold() {
        return bookIsOnHold;
    }

    /* Setters */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public void setBookIsAvailable(boolean bookIsAvailable) {
        this.bookIsAvailable = bookIsAvailable;
    }

    public void setBookIsOnLoan(boolean bookIsOnLoan) {
        this.bookIsOnLoan = bookIsOnLoan;
    }

    public void setBookIsOnHold(boolean bookIsOnHold) {
        this.bookIsOnHold = bookIsOnHold;
    }
}
