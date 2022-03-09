package minitest.service;

import minitest.model.Category;

import java.util.Optional;

public interface ICategoryService {
    Iterable<Category> findAll();

    Optional<Category> findById(Long id);

    Iterable<Category> findAddCate();
}
