package com.senai.project1.services;

import com.senai.project1.DTOs.BookDTO;
import com.senai.project1.models.BookModel;
import com.senai.project1.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public ResponseEntity<BookModel> Persist(BookDTO bookDTO) {
        BookModel bookModel = new BookModel();
        bookModel.setBok_id(bookDTO.bok_id());
        bookModel.setBok_title(bookDTO.bok_title());
        bookModel.setBok_author(bookDTO.bok_author());
        bookModel.setBok_isbn(bookDTO.bok_isbn());
        bookModel.setBok_pub_date(bookDTO.bok_pub_date());
        bookRepository.save(bookModel);
        return new ResponseEntity<>(bookModel,HttpStatus.OK);
    }



}
