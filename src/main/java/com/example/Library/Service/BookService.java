package com.example.Library.Service;

import com.example.Library.Entities.Book;
import com.example.Library.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /* Retrieve all books from database */
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    /* Get info for book with specific book id  */
    public Optional<Book> getBookById(int bookId){
        return bookRepository.findById(bookId);
    }

    /* Save new book in database */
    public void saveNewBook(Book book){
        bookRepository.save(book);
    }

    /* Delete existing book from database */
    public void deleteBookById(int bookId){
        bookRepository.deleteById(bookId);
    }

    /* Update info of existing book */
    public void updateBookInfo(Book book){
        bookRepository.save(book);
    }
}
