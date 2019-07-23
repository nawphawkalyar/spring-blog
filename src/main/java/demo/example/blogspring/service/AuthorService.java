package demo.example.blogspring.service;

import demo.example.blogspring.model.Author;

import java.util.List;

public interface AuthorService {
    Author create(Author author);
    Author finById(Long id);
    List<Author> findAll();
}
