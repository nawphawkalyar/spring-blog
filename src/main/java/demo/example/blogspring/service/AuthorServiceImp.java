package demo.example.blogspring.service;

import demo.example.blogspring.model.Author;
import demo.example.blogspring.repository.AuthorRepository;

import java.util.List;

public class AuthorServiceImp implements AuthorService {

    private AuthorRepository authorRepository;
    @Override
    public Author create(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author finById(Long id) {
        return authorRepository.getOne(id);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}
