package com.findme.backend.dao;

import java.util.List;

public interface GeneralDAO<T> {
    List<T> getList();
    T getById(int Id);
    T save(T t);
    int remove(int Id);
    T update(T t);
}
