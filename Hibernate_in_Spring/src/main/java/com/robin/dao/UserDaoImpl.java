package com.robin.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.robin.model.Login;
import com.robin.model.User;



public class UserDaoImpl implements UserDao {
	
	User obj=new User();
	
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	public void register(User user) {
		
		obj.setUsername(user.getUsername());
		obj.setPassword(user.getPassword());
		obj.setFirstname(user.getFirstname());
		obj.setLastname(user.getLastname());
		obj.setEmail(user.getEmail());
		obj.setAddress(user.getAddress());
		
		session.beginTransaction();
        session.save(obj);
        tx.commit();

	    

	  }

	  public List<User> validateUser (Login login) {
		  
		  session.beginTransaction();
		  Query q=(Query) session.createQuery("from User where username='"+login.getUsername()+"' and password='"+login.getPassword()+"'");
		  List<User> user=q.list();
		  
		  tx.commit();
		  
		return user.size()>0?user:null;


	  }

}
