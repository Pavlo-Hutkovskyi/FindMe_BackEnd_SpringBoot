package com.findme.backend.repository;

import com.findme.backend.dao.AdvertDAO;
import com.findme.backend.entity.Advert;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class AdvertRepository extends GeneralRepository<Advert> implements AdvertDAO {

    @Autowired
    public AdvertRepository(@Qualifier("advertEntityClass") Class<Advert> entityClass, EntityManager entityManager) {
        super(entityClass, entityManager);
    }
}
