package com.senai.project1.controllers;

import com.senai.project1.DTOs.BookDTO;
import com.senai.project1.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<BookDTO> Persist(@RequestBody BookDTO bookDTO) {
        return bookService.Persist(bookDTO);
    }

    @GetMapping
    public List<ResponseEntity<BookDTO>> GetAll() {
        return null;
    }

    @GetMapping
    public ResponseEntity<BookDTO> GetByTitle() {
        return null;
    }

    @GetMapping
    public ResponseEntity<BookDTO> GetByAuthor() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<String> Delete() {
        return null;
    }



}
