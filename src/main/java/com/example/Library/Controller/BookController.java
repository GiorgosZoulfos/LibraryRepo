package com.example.Library.Controller;

import com.example.Library.Entities.Book;
import com.example.Library.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /* ****************************************************** */
    /* ******************** GET GROUP *********************** */
    /* ****************************************************** */
    @GetMapping(path = "/book")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping(path = "/book/{bookId}")
    public Optional<Book> getBookById(@PathVariable(name = "bookId") int bookId){
        return bookService.getBookById(bookId);
    }

    /* ****************************************************** */
    /* ********************* PUT GROUP ********************** */
    /* ****************************************************** */
    @PutMapping(path = "/book")
    public HttpStatus updateBook(@RequestBody Book book){
        bookService.updateBookInfo(book);
        return HttpStatus.CREATED;
    }

    /* ****************************************************** */
    /* ******************* DELETE GROUP ********************* */
    /* ****************************************************** */
    @DeleteMapping(path = "/book/{bookId}")
    public HttpStatus deleteBookById(@PathVariable(name = "bookId") int bookId){
        bookService.deleteBookById(bookId);
        return HttpStatus.OK;
    }

    /* ****************************************************** */
    /* ******************** POST GROUP ********************** */
    /* ****************************************************** */
    @PostMapping(path = "/book")
    public HttpStatus postNewBook(@RequestBody Book book){
        bookService.saveNewBook(book);
        return HttpStatus.CREATED;
    }
}
