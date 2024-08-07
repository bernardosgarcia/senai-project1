package com.senai.project1.services;

import com.senai.project1.DTOs.BookDTO;
import com.senai.project1.models.BookModel;
import com.senai.project1.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.print.Book;

public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public ResponseEntity<BookDTO> Persist(BookDTO bookDTO) {
        BookModel bookModel = new BookModel();
        bookRepository.save(bookModel);
        return new ResponseEntity<>(bookDTO,HttpStatus.OK);
    }



}
