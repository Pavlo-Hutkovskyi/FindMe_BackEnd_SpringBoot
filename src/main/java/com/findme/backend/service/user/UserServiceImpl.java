package com.findme.backend.service.user;

import com.findme.backend.dao.UserDAO;
import com.findme.backend.entity.Advert;
import com.findme.backend.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getList() {
        return null;
    }

    @Override
    public User getById(int Id) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public int remove(int Id) {
        return 0;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public List<Advert> getAdvertsByUserId(int userId) {
        return userDAO.getAdvertsByUserId(userId);
    }
}
