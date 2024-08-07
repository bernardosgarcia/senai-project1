package com.senai.project1.controllers;

import com.senai.project1.DTOs.BookDTO;
import com.senai.project1.models.BookModel;
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

    @PostMapping("/book")
    public ResponseEntity<BookModel> Persist(@RequestBody BookDTO bookDTO) {
        return bookService.Persist(bookDTO);
    }

    @GetMapping
    public List<ResponseEntity<BookDTO>> GetAll() {
        return null;
    }

    @GetMapping("{title}")
    public ResponseEntity<BookDTO> GetByTitle(@PathVariable String title) {
        return null;
    }

    @GetMapping("{author}")
    public ResponseEntity<BookDTO> GetByAuthor(@PathVariable String author) {
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> Delete(@PathVariable Integer id) {
        return null;
    }



}
