package com.example.Library.Service;

import com.example.Library.Entities.Book;
import com.example.Library.Entities.Loan;
import com.example.Library.Entities.Student;
import com.example.Library.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    private LoanRepository loanRepository;
    private StudentService studentService;
    private BookService bookService;

    @Autowired
    public LoanService(LoanRepository loanRepository, StudentService studentService, BookService bookService) {
        this.loanRepository = loanRepository;
        this.studentService = studentService;
        this.bookService = bookService;
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

        /* Find student, if student exists update number of books that has loaned */
        Optional<Student> student = studentService.getStudentById(loan.getLoanStudentId());
        student.ifPresent(student1 -> student1.setStudentNumberOfBooksLoaned(student1.getStudentNumberOfBooksLoaned() + 1));

        /* Find book, if book exists update its availability status */
        Optional<Book> book = bookService.getBookById(loan.getLoanBookId());
        book.ifPresent(book1 -> book1.setBookIsOnLoan(true));
        book.ifPresent(book1 -> book1.setBookIsAvailable(false));

        /* If student or book doesn't exist return */
        if(student.isEmpty() || book.isEmpty()){
            return;
        }
        
        /* Else save new loan record in database */
        loanRepository.save(loan);
    }
}
