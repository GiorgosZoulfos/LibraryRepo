package com.example.Library.Repository;

import com.example.Library.Entities.Loan;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface LoanRepository extends JpaRepository<Loan, Integer> {
}
