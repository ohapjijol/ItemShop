package com.shop.item.daoImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.item.dao.ItemDao;
import com.shop.item.model.Item;

@Repository
public class ItemDaoImpl implements ItemDao {

	@Autowired
	SqlSession sqlsession;

	@Override
	public List<Item> retrieveAllitems() {
		return sqlsession.selectList("itemMapper.getItems");
	}

}
