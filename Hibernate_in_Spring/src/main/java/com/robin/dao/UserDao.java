package com.robin.dao;



import java.util.List;

import org.hibernate.Query;

import com.robin.model.Login;
import com.robin.model.User;

public interface UserDao {
	
	void register(User user);
	
	List<User> validateUser(Login login);

}
