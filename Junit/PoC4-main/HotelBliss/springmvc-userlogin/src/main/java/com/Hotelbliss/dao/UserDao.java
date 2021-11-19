package com.Hotelbliss.dao;

import com.Hotelbliss.model.Login;
import com.Hotelbliss.model.User;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
}
