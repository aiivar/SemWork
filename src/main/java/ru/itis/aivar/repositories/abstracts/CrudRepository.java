package ru.itis.aivar.repositories.abstracts;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T> {
    T save(T entity);
    void update(T entity);
    void delete(T entity);

    Optional<T> findById(Long id);
    List<T> findAll();

}
