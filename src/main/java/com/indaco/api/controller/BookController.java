package com.indaco.api.controller;

import com.indaco.api.domain.Book;
import com.indaco.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public Iterable<Book> getBooks() {
        return bookRepository.findAll();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/{bookId}")
    public Book getBook(@PathVariable Long bookId) {
        return bookRepository.findById(bookId).orElseThrow(RuntimeException::new);
    }

    @DeleteMapping
    public void deleteBook(@PathVariable Long bookId) {
        bookRepository.deleteById(bookId);
    }
}
