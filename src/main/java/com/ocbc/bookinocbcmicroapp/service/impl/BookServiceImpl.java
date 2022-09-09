package com.ocbc.bookinocbcmicroapp.service.impl;

import com.ocbc.bookinocbcmicroapp.dto.CreateOrUpdateBookDTO;
import com.ocbc.bookinocbcmicroapp.entity.Book;
import com.ocbc.bookinocbcmicroapp.repository.BookRepository;
import com.ocbc.bookinocbcmicroapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void createBook(CreateOrUpdateBookDTO validator) {
        Book book = new Book();
        book.setAuthor(validator.getAuthor());
        book.setTitle(validator.getTitle());
        book.setImage(validator.getImage());
        book.setSummary(validator.getSummary());
        bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books;
    }

    @Override
    public void updateBook(Book book, CreateOrUpdateBookDTO validator) {
        book.setAuthor(validator.getAuthor());
        book.setTitle(validator.getTitle());
        book.setImage(validator.getImage());
        book.setSummary(validator.getSummary());
        bookRepository.save(book);
    }

    @Override
    public Book getById(Long id) {
        Book book = bookRepository.findOneById(id);
        return book;
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}