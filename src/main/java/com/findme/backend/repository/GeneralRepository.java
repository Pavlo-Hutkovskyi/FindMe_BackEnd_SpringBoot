package com.findme.backend.repository;

import com.findme.backend.dao.GeneralDAO;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GeneralRepository<T> implements GeneralDAO<T> {
    private final Class<T> entityClass;
    private final EntityManager entityManager;

    @Autowired
    public GeneralRepository(Class<T> entityClass, EntityManager entityManager) {
        this.entityClass = entityClass;
        this.entityManager = entityManager;
    }

    @Override
    public List<T> getList() {
        return entityManager.createQuery(String.format("From %s", entityClass.getName()), entityClass).getResultList();
    }

    @Override
    public T getById(int id) {
        return entityManager.find(entityClass, id);
    }

    @Override
    public T save(T t) {
        return entityManager.merge(t);
    }

    @Override
    public int remove(int id) {
        var advertForRemove = getById(id);
        entityManager.remove(advertForRemove);
        return id;
    }

    @Override
    public T update(T t) {
        return entityManager.merge(t);
    }
}
