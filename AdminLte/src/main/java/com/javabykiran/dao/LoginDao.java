package com.javabykiran.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javabykiran.model.User;
@Repository
public class LoginDao {

	@Autowired
	SessionFactory sessionFactory;

	public User checkUser(User user) {
		List<User> listusers = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
				.add(Expression.eq("username", user.getUsername()));
		if (!listusers.isEmpty()) {
			return listusers.get(0);
		}
		return null;
	}

	public List<User> loadUser() {
		List<User> listusers = (List<User>) sessionFactory
		.getCurrentSession()
		.createCriteria(User.class).list();
		return listusers;
	}
}









