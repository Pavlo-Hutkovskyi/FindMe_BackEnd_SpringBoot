package com.findme.backend.repository;

import com.findme.backend.dao.UserDAO;
import com.findme.backend.entity.Advert;
import com.findme.backend.entity.User;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository extends GeneralRepository<User> implements UserDAO {

    private EntityManager entityManager;

    @Autowired
    public UserRepository(@Qualifier("userEntityClass") Class<User> entityClass, EntityManager entityManager) {
        super(entityClass, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public List<Advert> getAdvertsByUserId(int userId) {
        return entityManager
                .createQuery("FROM Advert WHERE user_id=:id", Advert.class)
                .setParameter("id", userId)
                .getResultList();
    }
}
