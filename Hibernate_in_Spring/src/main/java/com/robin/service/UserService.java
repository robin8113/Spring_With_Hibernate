package com.robin.service;

import java.util.List;

import org.hibernate.Query;

import com.robin.model.Login;
import com.robin.model.User;

public interface UserService {
   void register(User user);
	
    List<User> validateUser(Login login);

}
