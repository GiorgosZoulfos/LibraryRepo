package com.example.Library.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    /* Identification of Student*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    /* Student Name */
    public String studentFirstName;
    public String studentLastName;

    /* Student Info */
    public String studentAddress;
    public String studentEmail;

    /* Student Library-Related Info */
    public int studentNumberOfBooksLoaned;
    public int studentNumberOfBooksOnHold;
    public boolean studentIsFined;

    /* All args constructor */
    public Student(int studentId, String studentFirstName, String studentLastName, String studentAddress, String studentEmail, int studentNumberOfBooksLoaned, int studentNumberOfBooksOnHold, boolean studentIsFined) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentAddress = studentAddress;
        this.studentEmail = studentEmail;
        this.studentNumberOfBooksLoaned = studentNumberOfBooksLoaned;
        this.studentNumberOfBooksOnHold = studentNumberOfBooksOnHold;
        this.studentIsFined = studentIsFined;
    }

    /* No args constructor */
    public Student() {
    }

    /* Getters */
    public int getStudentId() {
        return studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public int getStudentNumberOfBooksLoaned() {
        return studentNumberOfBooksLoaned;
    }

    public int getStudentNumberOfBooksOnHold() {
        return studentNumberOfBooksOnHold;
    }

    public boolean isStudentIsFined() {
        return studentIsFined;
    }

    /* Setters */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setStudentNumberOfBooksLoaned(int studentNumberOfBooksLoaned) {
        this.studentNumberOfBooksLoaned = studentNumberOfBooksLoaned;
    }

    public void setStudentNumberOfBooksOnHold(int studentNumberOfBooksOnHold) {
        this.studentNumberOfBooksOnHold = studentNumberOfBooksOnHold;
    }

    public void setStudentIsFined(boolean studentIsFined) {
        this.studentIsFined = studentIsFined;
    }
}
