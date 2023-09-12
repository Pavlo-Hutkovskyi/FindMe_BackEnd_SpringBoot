package com.findme.backend.dao;

import com.findme.backend.entity.Advert;
import com.findme.backend.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDAO extends GeneralDAO<User>{
    List<Advert> getAdvertsByUserId(int userId);
}
