package com.tpecx.nasp.elasticsearch;

import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface CRUDRepository<T, ID> extends Repository<T, ID> {

    <S extends T> S save(S entity);

    Optional<T> findById(ID primaryKey);

    Iterable<T> findAll();

    long count();

    void delete(T entity);

    boolean existsById(ID primaryKey);

    // … more functionality omitted.
}
