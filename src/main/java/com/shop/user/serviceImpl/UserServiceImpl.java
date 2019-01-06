package com.shop.user.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.user.dao.UserDao;
import com.shop.user.model.User;
import com.shop.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public User getUser(String userId) {
		return userDao.getUser(userId);
	}

}
