package com.shop.user.daoImpl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.user.dao.UserDao;
import com.shop.user.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SqlSession sqlsession;

	@Override
	public User getUser(String userId) {
		return sqlsession.selectOne("getUser",userId);
	}
}
