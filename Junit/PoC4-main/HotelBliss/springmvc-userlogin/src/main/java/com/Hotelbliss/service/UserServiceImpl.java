package com.Hotelbliss.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.Hotelbliss.dao.UserDao;
import com.Hotelbliss.model.Login;
import com.Hotelbliss.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
