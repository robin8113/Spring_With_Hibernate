package com.robin.service;



import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.robin.dao.UserDao;
import com.robin.model.Login;
import com.robin.model.User;



public class UserServiceImpl implements UserService {
	
	@Autowired
	  public UserDao userDao;

	  public void register(User user) {
	    userDao.register(user);
	  }

	  public List<User> validateUser(Login login) {
	    return userDao.validateUser(login);
	  }

}
