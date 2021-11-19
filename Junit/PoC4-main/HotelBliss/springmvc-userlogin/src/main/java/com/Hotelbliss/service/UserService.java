package com.Hotelbliss.service;

import com.Hotelbliss.model.Login;
import com.Hotelbliss.model.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}
